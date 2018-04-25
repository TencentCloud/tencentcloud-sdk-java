package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBackupConfigResponse  extends AbstractModel{


    /**
    * 备份开始的最早时间点，单位为时刻。例如，2 - 凌晨2:00
    */
    @SerializedName("StartTimeMin")
    @Expose
    private Integer StartTimeMin;
    

    /**
    * 备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨6:00
    */
    @SerializedName("StartTimeMax")
    @Expose
    private Integer StartTimeMax;
    

    /**
    * 备份过期时间，单位为天
    */
    @SerializedName("BackupExpireDays")
    @Expose
    private Integer BackupExpireDays;
    

    /**
    * 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;
    

    /**
    * Binlog过期时间，单位为天
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Integer BinlogExpireDays;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取备份开始的最早时间点，单位为时刻。例如，2 - 凌晨2:00
     * @return StartTimeMin 备份开始的最早时间点，单位为时刻。例如，2 - 凌晨2:00
     */
    public Integer getStartTimeMin() {
        return this.StartTimeMin;
    }

    /**
     * 设置备份开始的最早时间点，单位为时刻。例如，2 - 凌晨2:00
     * @param StartTimeMin 备份开始的最早时间点，单位为时刻。例如，2 - 凌晨2:00
     */
    public void setStartTimeMin(Integer StartTimeMin) {
        this.StartTimeMin = StartTimeMin;
    }

    /**
     * 获取备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨6:00
     * @return StartTimeMax 备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨6:00
     */
    public Integer getStartTimeMax() {
        return this.StartTimeMax;
    }

    /**
     * 设置备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨6:00
     * @param StartTimeMax 备份开始的最晚时间点，单位为时刻。例如，6 - 凌晨6:00
     */
    public void setStartTimeMax(Integer StartTimeMax) {
        this.StartTimeMax = StartTimeMax;
    }

    /**
     * 获取备份过期时间，单位为天
     * @return BackupExpireDays 备份过期时间，单位为天
     */
    public Integer getBackupExpireDays() {
        return this.BackupExpireDays;
    }

    /**
     * 设置备份过期时间，单位为天
     * @param BackupExpireDays 备份过期时间，单位为天
     */
    public void setBackupExpireDays(Integer BackupExpireDays) {
        this.BackupExpireDays = BackupExpireDays;
    }

    /**
     * 获取备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份
     * @return BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * 设置备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份
     * @param BackupMethod 备份方式，可能的值为：physical - 物理备份，logical - 逻辑备份
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * 获取Binlog过期时间，单位为天
     * @return BinlogExpireDays Binlog过期时间，单位为天
     */
    public Integer getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * 设置Binlog过期时间，单位为天
     * @param BinlogExpireDays Binlog过期时间，单位为天
     */
    public void setBinlogExpireDays(Integer BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
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
        this.setParamSimple(map, prefix + "StartTimeMin", this.StartTimeMin);
        this.setParamSimple(map, prefix + "StartTimeMax", this.StartTimeMax);
        this.setParamSimple(map, prefix + "BackupExpireDays", this.BackupExpireDays);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

