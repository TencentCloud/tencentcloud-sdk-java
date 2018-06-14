package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DBSwitchInfo  extends AbstractModel{


    /**
    * 切换时间，格式为：2017-09-03 01:34:31
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
    * 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
    */
    @SerializedName("SwitchType")
    @Expose
    private String SwitchType;

    /**
     * 获取切换时间，格式为：2017-09-03 01:34:31
     * @return SwitchTime 切换时间，格式为：2017-09-03 01:34:31
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * 设置切换时间，格式为：2017-09-03 01:34:31
     * @param SwitchTime 切换时间，格式为：2017-09-03 01:34:31
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * 获取切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
     * @return SwitchType 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
     */
    public String getSwitchType() {
        return this.SwitchType;
    }

    /**
     * 设置切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
     * @param SwitchType 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
     */
    public void setSwitchType(String SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);

    }
}

