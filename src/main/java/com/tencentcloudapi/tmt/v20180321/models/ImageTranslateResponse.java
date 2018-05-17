package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImageTranslateResponse  extends AbstractModel{


    /**
    * 请求的SessionUuid返回
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;
    

    /**
    * 源语言
    */
    @SerializedName("Source")
    @Expose
    private String Source;
    

    /**
    * 目标语言
    */
    @SerializedName("Target")
    @Expose
    private String Target;
    

    /**
    * 图片翻译结果
    */
    @SerializedName("ImageRecord")
    @Expose
    private ImageRecord ImageRecord;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取请求的SessionUuid返回
     * @return SessionUuid 请求的SessionUuid返回
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * 设置请求的SessionUuid返回
     * @param SessionUuid 请求的SessionUuid返回
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * 获取源语言
     * @return Source 源语言
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置源语言
     * @param Source 源语言
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 获取目标语言
     * @return Target 目标语言
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * 设置目标语言
     * @param Target 目标语言
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * 获取图片翻译结果
     * @return ImageRecord 图片翻译结果
     */
    public ImageRecord getImageRecord() {
        return this.ImageRecord;
    }

    /**
     * 设置图片翻译结果
     * @param ImageRecord 图片翻译结果
     */
    public void setImageRecord(ImageRecord ImageRecord) {
        this.ImageRecord = ImageRecord;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamObj(map, prefix + "ImageRecord.", this.ImageRecord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

