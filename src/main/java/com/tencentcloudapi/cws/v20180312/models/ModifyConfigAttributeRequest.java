package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyConfigAttributeRequest  extends AbstractModel{


    /**
    * 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示
    */
    @SerializedName("NoticeLevel")
    @Expose
    private String NoticeLevel;

    /**
     * 获取漏洞告警通知等级，4位分别代表：高危、中危、低危、提示
     * @return NoticeLevel 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示
     */
    public String getNoticeLevel() {
        return this.NoticeLevel;
    }

    /**
     * 设置漏洞告警通知等级，4位分别代表：高危、中危、低危、提示
     * @param NoticeLevel 漏洞告警通知等级，4位分别代表：高危、中危、低危、提示
     */
    public void setNoticeLevel(String NoticeLevel) {
        this.NoticeLevel = NoticeLevel;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeLevel", this.NoticeLevel);

    }
}

