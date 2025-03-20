package com.tencentcloudapi.iotvideo.v20211125;
public enum IotvideoErrorCode {
     /*         操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /*         设备固件升级任务已经完成。 */
     FAILEDOPERATION_DEVICEFIRMWARETASKALREADDONE("FailedOperation.DeviceFirmwareTaskAlreadDone"),
     
     /*         设备正在升级中。 */
     FAILEDOPERATION_DEVICEISUPDATING("FailedOperation.DeviceIsUpdating"),
     
     /*         设备已经运行其他ota升级任务。 */
     FAILEDOPERATION_DEVICERUNNINGOTHEROTATASK("FailedOperation.DeviceRunningOtherOtaTask"),
     
     /*         无相关操作权限。 */
     FAILEDOPERATION_PERMISSIONDENIED("FailedOperation.PermissionDenied"),
     
     /*         内部错误。 */
     INTERNALERROR("InternalError"),
     
     /*         数据库内部错误。 */
     INTERNALERROR_DBOPERATIONERROR("InternalError.DBOperationError"),
     
     /*         参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /*         参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /*         固件已存在。 */
     INVALIDPARAMETERVALUE_FIRMWAREALREADYEXIST("InvalidParameterValue.FirmwareAlreadyExist"),
     
     /*         资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /*         设备固件升级任务不存在。 */
     RESOURCENOTFOUND_DEVICEFIRMWARETASKNOTEXIST("ResourceNotFound.DeviceFirmwareTaskNotExist"),
     
     /*         设备无固件版本。 */
     RESOURCENOTFOUND_DEVICEHASNOFIRMWARE("ResourceNotFound.DeviceHasNoFirmware"),
     
     /*         固件不存在。 */
     RESOURCENOTFOUND_FIRMWARENOTEXIST("ResourceNotFound.FirmwareNotExist"),
     
     /*         固件升级任务不存在。 */
     RESOURCENOTFOUND_FIRMWARETASKNOTEXIST("ResourceNotFound.FirmwareTaskNotExist"),
     
     /*         未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /*         操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private IotvideoErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

