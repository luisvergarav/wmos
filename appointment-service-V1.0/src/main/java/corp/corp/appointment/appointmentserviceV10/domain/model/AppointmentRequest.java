package corp.corp.appointment.appointmentserviceV10.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AppointmentRequest {

	private String country;

	private String commerce;
	
    
	protected AppointmentRequest.Header header;
	protected AppointmentRequest.Message message;

	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link AppointmentRequest.Header }
	 * 
	 */
	public AppointmentRequest.Header getHeader() {
		return header;
	}

	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *            allowed object is {@link AppointmentRequest.Header }
	 * 
	 */
	public void setHeader(AppointmentRequest.Header value) {
		this.header = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link AppointmentRequest.Message }
	 * 
	 */
	public AppointmentRequest.Message getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link AppointmentRequest.Message }
	 * 
	 */
	public void setMessage(AppointmentRequest.Message value) {
		this.message = value;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCommerce() {
		return commerce;
	}

	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	public static class Header {

		protected String source;
		protected String actionType;
		protected String sequenceNumber;
		protected String batchID;
		protected String referenceID;
		protected String userID;
		protected String password;
		protected String messageType;
		protected String companyID;
		protected String msgLocale;
		protected String msgTimeZone;
		protected String version;
		protected String sendMessage;
		protected String carrierCompany;
		protected String sequence;

		/**
		 * Gets the value of the source property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getSource() {
			return source;
		}

		/**
		 * Sets the value of the source property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setSource(String value) {
			this.source = value;
		}

		/**
		 * Gets the value of the actionType property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getActionType() {
			return actionType;
		}

		/**
		 * Sets the value of the actionType property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setActionType(String value) {
			this.actionType = value;
		}

		/**
		 * Gets the value of the sequenceNumber property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getSequenceNumber() {
			return sequenceNumber;
		}

		/**
		 * Sets the value of the sequenceNumber property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setSequenceNumber(String value) {
			this.sequenceNumber = value;
		}

		/**
		 * Gets the value of the batchID property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getBatchID() {
			return batchID;
		}

		/**
		 * Sets the value of the batchID property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setBatchID(String value) {
			this.batchID = value;
		}

		/**
		 * Gets the value of the referenceID property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getReferenceID() {
			return referenceID;
		}

		/**
		 * Sets the value of the referenceID property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setReferenceID(String value) {
			this.referenceID = value;
		}

		/**
		 * Gets the value of the userID property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getUserID() {
			return userID;
		}

		/**
		 * Sets the value of the userID property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setUserID(String value) {
			this.userID = value;
		}

		/**
		 * Gets the value of the password property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * Sets the value of the password property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setPassword(String value) {
			this.password = value;
		}

		/**
		 * Gets the value of the messageType property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMessageType() {
			return messageType;
		}

		/**
		 * Sets the value of the messageType property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setMessageType(String value) {
			this.messageType = value;
		}

		/**
		 * Gets the value of the companyID property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCompanyID() {
			return companyID;
		}

		/**
		 * Sets the value of the companyID property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCompanyID(String value) {
			this.companyID = value;
		}

		/**
		 * Gets the value of the msgLocale property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getMsgLocale() {
			return msgLocale;
		}

		/**
		 * Sets the value of the msgLocale property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setMsgLocale(String value) {
			this.msgLocale = value;
		}

		/**
		 * Gets the value of the msgTimeZone property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getMsgTimeZone() {
			return msgTimeZone;
		}

		/**
		 * Sets the value of the msgTimeZone property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setMsgTimeZone(String value) {
			this.msgTimeZone = value;
		}

		/**
		 * Gets the value of the version property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getVersion() {
			return version;
		}

		/**
		 * Sets the value of the version property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setVersion(String value) {
			this.version = value;
		}

		/**
		 * Gets the value of the sendMessage property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getSendMessage() {
			return sendMessage;
		}

		/**
		 * Sets the value of the sendMessage property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setSendMessage(String value) {
			this.sendMessage = value;
		}

		/**
		 * Gets the value of the carrierCompany property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getCarrierCompany() {
			return carrierCompany;
		}

		/**
		 * Sets the value of the carrierCompany property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setCarrierCompany(String value) {
			this.carrierCompany = value;
		}

		/**
		 * Gets the value of the sequence property.
		 * 
		 * @return possible object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public String getSequence() {
			return sequence;
		}

		/**
		 * Sets the value of the sequence property.
		 * 
		 * @param value
		 *            allowed object is {@link }{@code <}{@link String }{@code >}
		 * 
		 */
		public void setSequence(String value) {
			this.sequence = value;
		}

	}

	public static class Message {

		protected List<AppointmentRequest.Message.Appointment> appointment;

		/**
		 * Gets the value of the appointment property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot.
		 * Therefore any modification you make to the returned list will be present
		 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
		 * for the appointment property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAppointment().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link AppointmentRequest.Message.Appointment }
		 * 
		 * 
		 */
		public List<AppointmentRequest.Message.Appointment> getAppointment() {
			if (appointment == null) {
				appointment = new ArrayList<AppointmentRequest.Message.Appointment>();
			}
			return this.appointment;
		}

		public static class Appointment {

			protected String appointmentID;
			protected String appointmentType;
			protected String facilityAliasID;
			protected String appointmentStatus;
			protected String sealNumber;
			protected String carrierCode;
			protected String scheduledDttm;
			protected String actualCheckInDttm;
			protected String checkOutDttm;
			protected String loadUnloadStartDttm;
			protected String loadUnloadEndDttm;
			protected String appointmentPriority;
			protected String driverDurationInMin;
			protected String controlNumber;
			protected String requestorName;
			protected String requestorType;
			protected String reservedApptId;
			protected String tpCompanyId;
			protected String apptReasonId;
			protected String apptReasonCode;
			protected String trailerDurationInMin;
			protected String driverID;
			protected String cancelReasonCode;
			protected String communicationMode;
			protected String appointmentComments;
			protected String businessPartner;
			protected String cancelIndicator;
			protected String loadPosition;
			protected String businessUnit;
			protected String requestedTime;
			protected String templateId;
			protected String cancelledTcApptId;
			protected String appointmentSource;
			protected String loadConfiguration;
			protected String equipmentID;
			protected String equipmentCode;
			protected String tractorID;
			protected String tractorType;
			protected String equipment;
			protected String dockId;
			protected String doorId;
			protected List<AppointmentRequest.Message.Appointment.ApptObject> apptObject;
			protected List<AppointmentRequest.Message.Appointment.AppointmentSlots> appointmentSlots;
			protected List<AppointmentRequest.Message.Appointment.CustomAttribute> customAttribute;

			/**
			 * Gets the value of the appointmentID property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getAppointmentID() {
				return appointmentID;
			}

			/**
			 * Sets the value of the appointmentID property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setAppointmentID(String value) {
				this.appointmentID = value;
			}

			/**
			 * Gets the value of the appointmentType property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAppointmentType() {
				return appointmentType;
			}

			/**
			 * Sets the value of the appointmentType property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAppointmentType(String value) {
				this.appointmentType = value;
			}

			/**
			 * Gets the value of the facilityAliasID property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFacilityAliasID() {
				return facilityAliasID;
			}

			/**
			 * Sets the value of the facilityAliasID property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFacilityAliasID(String value) {
				this.facilityAliasID = value;
			}

			/**
			 * Gets the value of the appointmentStatus property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getAppointmentStatus() {
				return appointmentStatus;
			}

			/**
			 * Sets the value of the appointmentStatus property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setAppointmentStatus(String value) {
				this.appointmentStatus = value;
			}

			/**
			 * Gets the value of the sealNumber property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getSealNumber() {
				return sealNumber;
			}

			/**
			 * Sets the value of the sealNumber property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setSealNumber(String value) {
				this.sealNumber = value;
			}

			/**
			 * Gets the value of the carrierCode property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCarrierCode() {
				return carrierCode;
			}

			/**
			 * Sets the value of the carrierCode property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCarrierCode(String value) {
				this.carrierCode = value;
			}

			/**
			 * Gets the value of the scheduledDttm property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getScheduledDttm() {
				return scheduledDttm;
			}

			/**
			 * Sets the value of the scheduledDttm property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setScheduledDttm(String value) {
				this.scheduledDttm = value;
			}

			/**
			 * Gets the value of the actualCheckInDttm property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getActualCheckInDttm() {
				return actualCheckInDttm;
			}

			/**
			 * Sets the value of the actualCheckInDttm property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setActualCheckInDttm(String value) {
				this.actualCheckInDttm = value;
			}

			/**
			 * Gets the value of the checkOutDttm property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCheckOutDttm() {
				return checkOutDttm;
			}

			/**
			 * Sets the value of the checkOutDttm property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCheckOutDttm(String value) {
				this.checkOutDttm = value;
			}

			/**
			 * Gets the value of the loadUnloadStartDttm property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getLoadUnloadStartDttm() {
				return loadUnloadStartDttm;
			}

			/**
			 * Sets the value of the loadUnloadStartDttm property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setLoadUnloadStartDttm(String value) {
				this.loadUnloadStartDttm = value;
			}

			/**
			 * Gets the value of the loadUnloadEndDttm property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getLoadUnloadEndDttm() {
				return loadUnloadEndDttm;
			}

			/**
			 * Sets the value of the loadUnloadEndDttm property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setLoadUnloadEndDttm(String value) {
				this.loadUnloadEndDttm = value;
			}

			/**
			 * Gets the value of the appointmentPriority property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getAppointmentPriority() {
				return appointmentPriority;
			}

			/**
			 * Sets the value of the appointmentPriority property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setAppointmentPriority(String value) {
				this.appointmentPriority = value;
			}

			/**
			 * Gets the value of the driverDurationInMin property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getDriverDurationInMin() {
				return driverDurationInMin;
			}

			/**
			 * Sets the value of the driverDurationInMin property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setDriverDurationInMin(String value) {
				this.driverDurationInMin = value;
			}

			/**
			 * Gets the value of the controlNumber property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getControlNumber() {
				return controlNumber;
			}

			/**
			 * Sets the value of the controlNumber property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setControlNumber(String value) {
				this.controlNumber = value;
			}

			/**
			 * Gets the value of the requestorName property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getRequestorName() {
				return requestorName;
			}

			/**
			 * Sets the value of the requestorName property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setRequestorName(String value) {
				this.requestorName = value;
			}

			/**
			 * Gets the value of the requestorType property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getRequestorType() {
				return requestorType;
			}

			/**
			 * Sets the value of the requestorType property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setRequestorType(String value) {
				this.requestorType = value;
			}

			/**
			 * Gets the value of the reservedApptId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getReservedApptId() {
				return reservedApptId;
			}

			/**
			 * Sets the value of the reservedApptId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setReservedApptId(String value) {
				this.reservedApptId = value;
			}

			/**
			 * Gets the value of the tpCompanyId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getTpCompanyId() {
				return tpCompanyId;
			}

			/**
			 * Sets the value of the tpCompanyId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setTpCompanyId(String value) {
				this.tpCompanyId = value;
			}

			/**
			 * Gets the value of the apptReasonId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getApptReasonId() {
				return apptReasonId;
			}

			/**
			 * Sets the value of the apptReasonId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setApptReasonId(String value) {
				this.apptReasonId = value;
			}

			/**
			 * Gets the value of the apptReasonCode property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getApptReasonCode() {
				return apptReasonCode;
			}

			/**
			 * Sets the value of the apptReasonCode property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setApptReasonCode(String value) {
				this.apptReasonCode = value;
			}

			/**
			 * Gets the value of the trailerDurationInMin property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getTrailerDurationInMin() {
				return trailerDurationInMin;
			}

			/**
			 * Sets the value of the trailerDurationInMin property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setTrailerDurationInMin(String value) {
				this.trailerDurationInMin = value;
			}

			/**
			 * Gets the value of the driverID property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getDriverID() {
				return driverID;
			}

			/**
			 * Sets the value of the driverID property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setDriverID(String value) {
				this.driverID = value;
			}

			/**
			 * Gets the value of the cancelReasonCode property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCancelReasonCode() {
				return cancelReasonCode;
			}

			/**
			 * Sets the value of the cancelReasonCode property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCancelReasonCode(String value) {
				this.cancelReasonCode = value;
			}

			/**
			 * Gets the value of the communicationMode property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCommunicationMode() {
				return communicationMode;
			}

			/**
			 * Sets the value of the communicationMode property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCommunicationMode(String value) {
				this.communicationMode = value;
			}

			/**
			 * Gets the value of the appointmentComments property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getAppointmentComments() {
				return appointmentComments;
			}

			/**
			 * Sets the value of the appointmentComments property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setAppointmentComments(String value) {
				this.appointmentComments = value;
			}

			/**
			 * Gets the value of the businessPartner property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getBusinessPartner() {
				return businessPartner;
			}

			/**
			 * Sets the value of the businessPartner property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setBusinessPartner(String value) {
				this.businessPartner = value;
			}

			/**
			 * Gets the value of the cancelIndicator property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCancelIndicator() {
				return cancelIndicator;
			}

			/**
			 * Sets the value of the cancelIndicator property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCancelIndicator(String value) {
				this.cancelIndicator = value;
			}

			/**
			 * Gets the value of the loadPosition property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getLoadPosition() {
				return loadPosition;
			}

			/**
			 * Sets the value of the loadPosition property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setLoadPosition(String value) {
				this.loadPosition = value;
			}

			/**
			 * Gets the value of the businessUnit property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getBusinessUnit() {
				return businessUnit;
			}

			/**
			 * Sets the value of the businessUnit property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setBusinessUnit(String value) {
				this.businessUnit = value;
			}

			/**
			 * Gets the value of the requestedTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRequestedTime() {
				return requestedTime;
			}

			/**
			 * Sets the value of the requestedTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRequestedTime(String value) {
				this.requestedTime = value;
			}

			/**
			 * Gets the value of the templateId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getTemplateId() {
				return templateId;
			}

			/**
			 * Sets the value of the templateId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setTemplateId(String value) {
				this.templateId = value;
			}

			/**
			 * Gets the value of the cancelledTcApptId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getCancelledTcApptId() {
				return cancelledTcApptId;
			}

			/**
			 * Sets the value of the cancelledTcApptId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setCancelledTcApptId(String value) {
				this.cancelledTcApptId = value;
			}

			/**
			 * Gets the value of the appointmentSource property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getAppointmentSource() {
				return appointmentSource;
			}

			/**
			 * Sets the value of the appointmentSource property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setAppointmentSource(String value) {
				this.appointmentSource = value;
			}

			/**
			 * Gets the value of the loadConfiguration property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getLoadConfiguration() {
				return loadConfiguration;
			}

			/**
			 * Sets the value of the loadConfiguration property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setLoadConfiguration(String value) {
				this.loadConfiguration = value;
			}

			/**
			 * Gets the value of the equipmentID property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getEquipmentID() {
				return equipmentID;
			}

			/**
			 * Sets the value of the equipmentID property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setEquipmentID(String value) {
				this.equipmentID = value;
			}

			/**
			 * Gets the value of the equipmentCode property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getEquipmentCode() {
				return equipmentCode;
			}

			/**
			 * Sets the value of the equipmentCode property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setEquipmentCode(String value) {
				this.equipmentCode = value;
			}

			/**
			 * Gets the value of the tractorID property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getTractorID() {
				return tractorID;
			}

			/**
			 * Sets the value of the tractorID property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setTractorID(String value) {
				this.tractorID = value;
			}

			/**
			 * Gets the value of the tractorType property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getTractorType() {
				return tractorType;
			}

			/**
			 * Sets the value of the tractorType property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setTractorType(String value) {
				this.tractorType = value;
			}

			/**
			 * Gets the value of the equipment property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getEquipment() {
				return equipment;
			}

			/**
			 * Sets the value of the equipment property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setEquipment(String value) {
				this.equipment = value;
			}

			/**
			 * Gets the value of the dockId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getDockId() {
				return dockId;
			}

			/**
			 * Sets the value of the dockId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setDockId(String value) {
				this.dockId = value;
			}

			/**
			 * Gets the value of the doorId property.
			 * 
			 * @return possible object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public String getDoorId() {
				return doorId;
			}

			/**
			 * Sets the value of the doorId property.
			 * 
			 * @param value
			 *            allowed object is {@link }{@code <}{@link String }{@code >}
			 * 
			 */
			public void setDoorId(String value) {
				this.doorId = value;
			}

			/**
			 * Gets the value of the apptObject property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot.
			 * Therefore any modification you make to the returned list will be present
			 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
			 * for the apptObject property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getApptObject().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link AppointmentRequest.Message.Appointment.ApptObject }
			 * 
			 * 
			 */
			public List<AppointmentRequest.Message.Appointment.ApptObject> getApptObject() {
				if (apptObject == null) {
					apptObject = new ArrayList<AppointmentRequest.Message.Appointment.ApptObject>();
				}
				return this.apptObject;
			}

			/**
			 * Gets the value of the appointmentSlots property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot.
			 * Therefore any modification you make to the returned list will be present
			 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
			 * for the appointmentSlots property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getAppointmentSlots().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link AppointmentRequest.Message.Appointment.AppointmentSlots }
			 * 
			 * 
			 */
			public List<AppointmentRequest.Message.Appointment.AppointmentSlots> getAppointmentSlots() {
				if (appointmentSlots == null) {
					appointmentSlots = new ArrayList<AppointmentRequest.Message.Appointment.AppointmentSlots>();
				}
				return this.appointmentSlots;
			}

			/**
			 * Gets the value of the customAttribute property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot.
			 * Therefore any modification you make to the returned list will be present
			 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
			 * for the customAttribute property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getCustomAttribute().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link AppointmentRequest.Message.Appointment.CustomAttribute }
			 * 
			 * 
			 */
			public List<AppointmentRequest.Message.Appointment.CustomAttribute> getCustomAttribute() {
				if (customAttribute == null) {
					customAttribute = new ArrayList<AppointmentRequest.Message.Appointment.CustomAttribute>();
				}
				return this.customAttribute;
			}

			public static class AppointmentSlots {

				protected String slotId;
				protected String slotStartDttm;
				protected String slotDuration;
				protected String capacityUsed;

				/**
				 * Gets the value of the slotId property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getSlotId() {
					return slotId;
				}

				/**
				 * Sets the value of the slotId property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setSlotId(String value) {
					this.slotId = value;
				}

				/**
				 * Gets the value of the slotStartDttm property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getSlotStartDttm() {
					return slotStartDttm;
				}

				/**
				 * Sets the value of the slotStartDttm property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setSlotStartDttm(String value) {
					this.slotStartDttm = value;
				}

				/**
				 * Gets the value of the slotDuration property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getSlotDuration() {
					return slotDuration;
				}

				/**
				 * Sets the value of the slotDuration property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setSlotDuration(String value) {
					this.slotDuration = value;
				}

				/**
				 * Gets the value of the capacityUsed property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getCapacityUsed() {
					return capacityUsed;
				}

				/**
				 * Sets the value of the capacityUsed property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setCapacityUsed(String value) {
					this.capacityUsed = value;
				}

			}

			public static class ApptObject {

				protected String objectType;
				protected String objectID;
				protected String stopSeq;
				protected List<AppointmentRequest.Message.Appointment.ApptObject.PurchaseOrder> purchaseOrder;

				/**
				 * Gets the value of the objectType property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getObjectType() {
					return objectType;
				}

				/**
				 * Sets the value of the objectType property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setObjectType(String value) {
					this.objectType = value;
				}

				/**
				 * Gets the value of the objectID property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getObjectID() {
					return objectID;
				}

				/**
				 * Sets the value of the objectID property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setObjectID(String value) {
					this.objectID = value;
				}

				/**
				 * Gets the value of the stopSeq property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getStopSeq() {
					return stopSeq;
				}

				/**
				 * Sets the value of the stopSeq property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setStopSeq(String value) {
					this.stopSeq = value;
				}

				/**
				 * Gets the value of the purchaseOrder property.
				 * 
				 * <p>
				 * This accessor method returns a reference to the live list, not a snapshot.
				 * Therefore any modification you make to the returned list will be present
				 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
				 * for the purchaseOrder property.
				 * 
				 * <p>
				 * For example, to add a new item, do as follows:
				 * 
				 * <pre>
				 * getPurchaseOrder().add(newItem);
				 * </pre>
				 * 
				 * 
				 * <p>
				 * Objects of the following type(s) are allowed in the list
				 * {@link AppointmentRequest.Message.Appointment.ApptObject.PurchaseOrder }
				 * 
				 * 
				 */
				public List<AppointmentRequest.Message.Appointment.ApptObject.PurchaseOrder> getPurchaseOrder() {
					if (purchaseOrder == null) {
						purchaseOrder = new ArrayList<AppointmentRequest.Message.Appointment.ApptObject.PurchaseOrder>();
					}
					return this.purchaseOrder;
				}

				public static class PurchaseOrder {

					protected String bookedSize;
					protected String sizeUOM;
					protected String tcOrderId;

					/**
					 * Gets the value of the bookedSize property.
					 * 
					 * @return possible object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public String getBookedSize() {
						return bookedSize;
					}

					/**
					 * Sets the value of the bookedSize property.
					 * 
					 * @param value
					 *            allowed object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public void setBookedSize(String value) {
						this.bookedSize = value;
					}

					/**
					 * Gets the value of the sizeUOM property.
					 * 
					 * @return possible object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public String getSizeUOM() {
						return sizeUOM;
					}

					/**
					 * Sets the value of the sizeUOM property.
					 * 
					 * @param value
					 *            allowed object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public void setSizeUOM(String value) {
						this.sizeUOM = value;
					}

					/**
					 * Gets the value of the tcOrderId property.
					 * 
					 * @return possible object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public String getTCOrderId() {
						return tcOrderId;
					}

					/**
					 * Sets the value of the tcOrderId property.
					 * 
					 * @param value
					 *            allowed object is {@link }{@code <}{@link String }{@code >}
					 * 
					 */
					public void setTCOrderId(String value) {
						this.tcOrderId = value;
					}

				}

			}

			public static class CustomAttribute {

				protected String attributeName;
				protected String attributeValue;

				/**
				 * Gets the value of the attributeName property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getAttributeName() {
					return attributeName;
				}

				/**
				 * Sets the value of the attributeName property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setAttributeName(String value) {
					this.attributeName = value;
				}

				/**
				 * Gets the value of the attributeValue property.
				 * 
				 * @return possible object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public String getAttributeValue() {
					return attributeValue;
				}

				/**
				 * Sets the value of the attributeValue property.
				 * 
				 * @param value
				 *            allowed object is {@link }{@code <}{@link String }{@code >}
				 * 
				 */
				public void setAttributeValue(String value) {
					this.attributeValue = value;
				}

			}

		}

	}

}
