package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBBackupsResponse  extends AbstractModel{


    /**
    * 返回备份列表中备份文件的个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 备份列表
    */
    @SerializedName("BackupList")
    @Expose
    private DBBackup [] BackupList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返回备份列表中备份文件的个数
     * @return TotalCount 返回备份列表中备份文件的个数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置返回备份列表中备份文件的个数
     * @param TotalCount 返回备份列表中备份文件的个数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取备份列表
     * @return BackupList 备份列表
     */
    public DBBackup [] getBackupList() {
        return this.BackupList;
    }

    /**
     * 设置备份列表
     * @param BackupList 备份列表
     */
    public void setBackupList(DBBackup [] BackupList) {
        this.BackupList = BackupList;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BackupList.", this.BackupList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

