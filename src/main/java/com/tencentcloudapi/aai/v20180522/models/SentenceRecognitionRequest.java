package com.tencentcloudapi.aai.v20180522.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SentenceRecognitionRequest  extends AbstractModel{


    /**
    * 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;
    

    /**
    * 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。
    */
    @SerializedName("SubServiceType")
    @Expose
    private Integer SubServiceType;
    

    /**
    * 引擎类型。8k：电话 8k 通用模型；16k：16k 通用模型。
    */
    @SerializedName("EngSerViceType")
    @Expose
    private String EngSerViceType;
    

    /**
    * 语音数据来源。0：语音 URL；1：语音数据（post body）。
    */
    @SerializedName("SourceType")
    @Expose
    private Integer SourceType;
    

    /**
    * 语音 URL，公网可下载。当 SourceType 值为 0 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。
    */
    @SerializedName("Url")
    @Expose
    private String Url;
    

    /**
    * 识别音频的音频格式（支持mp3,wav）。
    */
    @SerializedName("VoiceFormat")
    @Expose
    private String VoiceFormat;
    

    /**
    * 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
    */
    @SerializedName("UsrAudioKey")
    @Expose
    private String UsrAudioKey;
    

    /**
    * 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码
    */
    @SerializedName("Data")
    @Expose
    private String Data;
    

    /**
    * 数据长度，当 SourceType 值为1时必须填写，为0可不写。
    */
    @SerializedName("DataLen")
    @Expose
    private Integer DataLen;
    

    /**
     * 获取腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     * @return ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     * @param ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。
     * @return SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。
     */
    public Integer getSubServiceType() {
        return this.SubServiceType;
    }

    /**
     * 设置子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。
     * @param SubServiceType 子服务类型。0：离线语音识别。1：实时流式识别，2，一句话识别。
     */
    public void setSubServiceType(Integer SubServiceType) {
        this.SubServiceType = SubServiceType;
    }

    /**
     * 获取引擎类型。8k：电话 8k 通用模型；16k：16k 通用模型。
     * @return EngSerViceType 引擎类型。8k：电话 8k 通用模型；16k：16k 通用模型。
     */
    public String getEngSerViceType() {
        return this.EngSerViceType;
    }

    /**
     * 设置引擎类型。8k：电话 8k 通用模型；16k：16k 通用模型。
     * @param EngSerViceType 引擎类型。8k：电话 8k 通用模型；16k：16k 通用模型。
     */
    public void setEngSerViceType(String EngSerViceType) {
        this.EngSerViceType = EngSerViceType;
    }

    /**
     * 获取语音数据来源。0：语音 URL；1：语音数据（post body）。
     * @return SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public Integer getSourceType() {
        return this.SourceType;
    }

    /**
     * 设置语音数据来源。0：语音 URL；1：语音数据（post body）。
     * @param SourceType 语音数据来源。0：语音 URL；1：语音数据（post body）。
     */
    public void setSourceType(Integer SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * 获取语音 URL，公网可下载。当 SourceType 值为 0 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。
     * @return Url 语音 URL，公网可下载。当 SourceType 值为 0 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置语音 URL，公网可下载。当 SourceType 值为 0 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。
     * @param Url 语音 URL，公网可下载。当 SourceType 值为 0 时须填写该字段，为 1 时不填；URL 的长度大于 0，小于 2048，需进行urlencode编码。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取识别音频的音频格式（支持mp3,wav）。
     * @return VoiceFormat 识别音频的音频格式（支持mp3,wav）。
     */
    public String getVoiceFormat() {
        return this.VoiceFormat;
    }

    /**
     * 设置识别音频的音频格式（支持mp3,wav）。
     * @param VoiceFormat 识别音频的音频格式（支持mp3,wav）。
     */
    public void setVoiceFormat(String VoiceFormat) {
        this.VoiceFormat = VoiceFormat;
    }

    /**
     * 获取用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     * @return UsrAudioKey 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     */
    public String getUsrAudioKey() {
        return this.UsrAudioKey;
    }

    /**
     * 设置用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     * @param UsrAudioKey 用户端对此任务的唯一标识，用户自助生成，用于用户查找识别结果。
     */
    public void setUsrAudioKey(String UsrAudioKey) {
        this.UsrAudioKey = UsrAudioKey;
    }

    /**
     * 获取语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码
     * @return Data 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码
     * @param Data 语音数据，当SourceType 值为1时必须填写，为0可不写。要base64编码
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 获取数据长度，当 SourceType 值为1时必须填写，为0可不写。
     * @return DataLen 数据长度，当 SourceType 值为1时必须填写，为0可不写。
     */
    public Integer getDataLen() {
        return this.DataLen;
    }

    /**
     * 设置数据长度，当 SourceType 值为1时必须填写，为0可不写。
     * @param DataLen 数据长度，当 SourceType 值为1时必须填写，为0可不写。
     */
    public void setDataLen(Integer DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SubServiceType", this.SubServiceType);
        this.setParamSimple(map, prefix + "EngSerViceType", this.EngSerViceType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "VoiceFormat", this.VoiceFormat);
        this.setParamSimple(map, prefix + "UsrAudioKey", this.UsrAudioKey);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);

    }
}

