package rtl.corp.corp.sche.whmg.appointment.appointmentV10.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import corp.common.e2e.core.E2EContext;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.model.APIResponse;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.model.AppointmentReq;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.model.AppointmentRequestWrapper;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.domain.service.AppointmentService;
import rtl.corp.corp.sche.whmg.appointment.appointmentV10.rest.RestConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController()

@Api(value = "WMOS", description = "WMOS Appointment API")
@Slf4j
public class AppointmentController {

	@Autowired
	AppointmentService service;

	@RequestMapping(path = "/api/wmos/v1.0/appointment", method = POST)

	@ApiOperation(value = "Notify Appointments", response = AppointmentReq.class)
	public ResponseEntity<APIResponse> addAppointment(@RequestBody AppointmentRequestWrapper request,
			@RequestHeader HttpHeaders headers) {

		try {
			
			E2EContext e2e = new E2EContext();
			e2e.setE2EContext(headers);
			e2e.setServiceRef("Appointment");
			
			service.notify(request.getAppointmentReq());
			log.debug("Request Appointment successful!", request.getAppointmentReq().getHeader().getReferenceID());
		} catch (Exception e) {

			log.debug("Request Appointment Error!", request.getAppointmentReq().getHeader().getReferenceID());
			return new ResponseEntity<APIResponse>(this.buildErrorRes(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<APIResponse>(this.buildSuccessRes(), HttpStatus.OK);
	}



	/**
	 * API success response
	 *
	 * @return
	 */

	private APIResponse buildSuccessRes() {
		APIResponse res = new APIResponse();
		res.setCode(RestConstants.SUCCESS_CODE);
		res.setType(RestConstants.SUCCESS_RESPONSE);
		return res;
	}

	/**
	 * API Error response
	 *
	 * @return
	 */
	private APIResponse buildErrorRes(String error) {
		APIResponse res = new APIResponse();
		res.setCode(RestConstants.ERROR_CODE);
		res.setType(RestConstants.SYSTEM_ERROR);
		res.setMessage(error);
		return res;
	}

}