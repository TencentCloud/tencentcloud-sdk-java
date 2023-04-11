package com.tencentcloudapi.vrs.v20200824;
public enum VrsErrorCode {
    // 任务不存在。
     FAILEDOPERATION_NOSUCHTASK("FailedOperation.NoSuchTask"),
     
    // 检测失败。
     FAILEDOPERATION_VOICEEVALUATEFAILED("FailedOperation.VoiceEvaluateFailed"),
     
    // 音频质量差。
     FAILEDOPERATION_VOICENOTQUALIFIED("FailedOperation.VoiceNotQualified"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 音频数据错误。
     INVALIDPARAMETERVALUE_AUDIODATA("InvalidParameterValue.AudioData"),
     
    // Codec非法，请参考Codec参数说明。
     INVALIDPARAMETERVALUE_CODEC("InvalidParameterValue.Codec"),
     
    // SampleRate非法，请参考SampleRate参数说明。
     INVALIDPARAMETERVALUE_SAMPLERATE("InvalidParameterValue.SampleRate"),
     
    // 音色性别错误。
     INVALIDPARAMETERVALUE_VOICEGENDER("InvalidParameterValue.VoiceGender"),
     
    // 音色语言错误。
     INVALIDPARAMETERVALUE_VOICELANGUAGE("InvalidParameterValue.VoiceLanguage"),
     
    // 音色名称错误。
     INVALIDPARAMETERVALUE_VOICENAME("InvalidParameterValue.VoiceName"),
     
    // 无声音复刻任务配额
     UNSUPPORTEDOPERATION_VRSQUOTAEXHAUSTED("UnsupportedOperation.VRSQuotaExhausted");
     
    private String value;
    private VrsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

