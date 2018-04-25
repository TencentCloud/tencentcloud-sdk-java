package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SpeechTranslateRequest  extends AbstractModel{


    /**
    * 一段完整的语⾳音对应⼀一个sessionUuid
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;
    

    /**
    * 音频中的语⾔言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;
    

    /**
    * 翻译⽬目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;
    

    /**
    * pcm : 146   amr : 33554432   mp3 : 83886080
    */
    @SerializedName("AudioFormat")
    @Expose
    private Integer AudioFormat;
    

    /**
    * 语⾳音分⽚片后的第⼏几⽚片
    */
    @SerializedName("Seq")
    @Expose
    private Integer Seq;
    

    /**
    * 是否最后⼀片
    */
    @SerializedName("IsEnd")
    @Expose
    private Integer IsEnd;
    

    /**
    * 语⾳音分⽚片内容的 base64字符串串
    */
    @SerializedName("Data")
    @Expose
    private String Data;
    

    /**
     * 获取一段完整的语⾳音对应⼀一个sessionUuid
     * @return SessionUuid 一段完整的语⾳音对应⼀一个sessionUuid
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * 设置一段完整的语⾳音对应⼀一个sessionUuid
     * @param SessionUuid 一段完整的语⾳音对应⼀一个sessionUuid
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * 获取音频中的语⾔言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @return Source 音频中的语⾔言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置音频中的语⾔言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Source 音频中的语⾔言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 获取翻译⽬目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @return Target 翻译⽬目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * 设置翻译⽬目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Target 翻译⽬目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * 获取pcm : 146   amr : 33554432   mp3 : 83886080
     * @return AudioFormat pcm : 146   amr : 33554432   mp3 : 83886080
     */
    public Integer getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * 设置pcm : 146   amr : 33554432   mp3 : 83886080
     * @param AudioFormat pcm : 146   amr : 33554432   mp3 : 83886080
     */
    public void setAudioFormat(Integer AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * 获取语⾳音分⽚片后的第⼏几⽚片
     * @return Seq 语⾳音分⽚片后的第⼏几⽚片
     */
    public Integer getSeq() {
        return this.Seq;
    }

    /**
     * 设置语⾳音分⽚片后的第⼏几⽚片
     * @param Seq 语⾳音分⽚片后的第⼏几⽚片
     */
    public void setSeq(Integer Seq) {
        this.Seq = Seq;
    }

    /**
     * 获取是否最后⼀片
     * @return IsEnd 是否最后⼀片
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * 设置是否最后⼀片
     * @param IsEnd 是否最后⼀片
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * 获取语⾳音分⽚片内容的 base64字符串串
     * @return Data 语⾳音分⽚片内容的 base64字符串串
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置语⾳音分⽚片内容的 base64字符串串
     * @param Data 语⾳音分⽚片内容的 base64字符串串
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

