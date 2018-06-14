package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteBackupRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份任务ID。该任务ID为[创建云数据库备份](https://cloud.tencent.com/document/api/236/15844)接口返回的任务ID。
    */
    @SerializedName("BackupId")
    @Expose
    private Integer BackupId;

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取备份任务ID。该任务ID为[创建云数据库备份](https://cloud.tencent.com/document/api/236/15844)接口返回的任务ID。
     * @return BackupId 备份任务ID。该任务ID为[创建云数据库备份](https://cloud.tencent.com/document/api/236/15844)接口返回的任务ID。
     */
    public Integer getBackupId() {
        return this.BackupId;
    }

    /**
     * 设置备份任务ID。该任务ID为[创建云数据库备份](https://cloud.tencent.com/document/api/236/15844)接口返回的任务ID。
     * @param BackupId 备份任务ID。该任务ID为[创建云数据库备份](https://cloud.tencent.com/document/api/236/15844)接口返回的任务ID。
     */
    public void setBackupId(Integer BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

