package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBackupDownloadDbTableCodeRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，格式为：2017-07-12 10:29:20。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 待下载的数据库和数据表列表。
    */
    @SerializedName("DatabaseTableList")
    @Expose
    private DatabaseTableList [] DatabaseTableList;

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
     * 获取开始时间，格式为：2017-07-12 10:29:20。
     * @return StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，格式为：2017-07-12 10:29:20。
     * @param StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取待下载的数据库和数据表列表。
     * @return DatabaseTableList 待下载的数据库和数据表列表。
     */
    public DatabaseTableList [] getDatabaseTableList() {
        return this.DatabaseTableList;
    }

    /**
     * 设置待下载的数据库和数据表列表。
     * @param DatabaseTableList 待下载的数据库和数据表列表。
     */
    public void setDatabaseTableList(DatabaseTableList [] DatabaseTableList) {
        this.DatabaseTableList = DatabaseTableList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "DatabaseTableList.", this.DatabaseTableList);

    }
}

