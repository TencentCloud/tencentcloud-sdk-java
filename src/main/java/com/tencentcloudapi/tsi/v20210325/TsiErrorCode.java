package com.tencentcloudapi.tsi.v20210325;
public enum TsiErrorCode {
     /* 参数错误。 */
     INVALIDPARAMETER_MISSINGPARAMETER("InvalidParameter.MissingParameter"),
     
     /* 不支持的 AudioFormat 参数，请参照文档说明。 */
     UNSUPPORTEDOPERATION_AUDIOFORMAT("UnsupportedOperation.AudioFormat"),
     
     /* 不支持的 IsEnd 参数，请参照文档说明。 */
     UNSUPPORTEDOPERATION_ISEND("UnsupportedOperation.IsEnd"),
     
     /* 不支持的 IsNew 参数，请参照文档说明。 */
     UNSUPPORTEDOPERATION_ISNEW("UnsupportedOperation.IsNew"),
     
     /* 不支持的 SeMax 参数，请参照文档说明。 */
     UNSUPPORTEDOPERATION_SEMAX("UnsupportedOperation.SeMax"),
     
     /* 不支持的 TranslateTime 参数，请参照文档说明。 */
     UNSUPPORTEDOPERATION_TRANSLATETIME("UnsupportedOperation.TranslateTime");
     
    private String value;
    private TsiErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

