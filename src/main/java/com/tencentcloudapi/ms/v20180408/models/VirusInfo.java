package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class VirusInfo  extends AbstractModel{


    /**
    * 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
    */
    @SerializedName("SafeType")
    @Expose
    private Integer SafeType;

    /**
    * 病毒名称， utf8编码，非病毒时值为空
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 病毒描述，utf8编码，非病毒时值为空
    */
    @SerializedName("VirusDesc")
    @Expose
    private String VirusDesc;

    /**
     * 获取软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     * @return SafeType 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     */
    public Integer getSafeType() {
        return this.SafeType;
    }

    /**
     * 设置软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     * @param SafeType 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     */
    public void setSafeType(Integer SafeType) {
        this.SafeType = SafeType;
    }

    /**
     * 获取病毒名称， utf8编码，非病毒时值为空
     * @return VirusName 病毒名称， utf8编码，非病毒时值为空
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * 设置病毒名称， utf8编码，非病毒时值为空
     * @param VirusName 病毒名称， utf8编码，非病毒时值为空
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * 获取病毒描述，utf8编码，非病毒时值为空
     * @return VirusDesc 病毒描述，utf8编码，非病毒时值为空
     */
    public String getVirusDesc() {
        return this.VirusDesc;
    }

    /**
     * 设置病毒描述，utf8编码，非病毒时值为空
     * @param VirusDesc 病毒描述，utf8编码，非病毒时值为空
     */
    public void setVirusDesc(String VirusDesc) {
        this.VirusDesc = VirusDesc;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SafeType", this.SafeType);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusDesc", this.VirusDesc);

    }
}

