package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TextTranslateResponse  extends AbstractModel{


    /**
    * 翻译后的文本
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 源语言，详见入参Target
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言，详见入参Target
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取翻译后的文本
     * @return TargetText 翻译后的文本
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * 设置翻译后的文本
     * @param TargetText 翻译后的文本
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * 获取源语言，详见入参Target
     * @return Source 源语言，详见入参Target
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置源语言，详见入参Target
     * @param Source 源语言，详见入参Target
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 获取目标语言，详见入参Target
     * @return Target 目标语言，详见入参Target
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * 设置目标语言，详见入参Target
     * @param Target 目标语言，详见入参Target
     */
    public void setTarget(String Target) {
        this.Target = Target;
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
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

