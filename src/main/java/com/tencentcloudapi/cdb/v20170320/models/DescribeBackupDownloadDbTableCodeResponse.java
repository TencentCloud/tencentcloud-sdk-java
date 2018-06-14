package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBackupDownloadDbTableCodeResponse  extends AbstractModel{


    /**
    * 下载位点
    */
    @SerializedName("DatabaseTableCode")
    @Expose
    private Integer DatabaseTableCode;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取下载位点
     * @return DatabaseTableCode 下载位点
     */
    public Integer getDatabaseTableCode() {
        return this.DatabaseTableCode;
    }

    /**
     * 设置下载位点
     * @param DatabaseTableCode 下载位点
     */
    public void setDatabaseTableCode(Integer DatabaseTableCode) {
        this.DatabaseTableCode = DatabaseTableCode;
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
        this.setParamSimple(map, prefix + "DatabaseTableCode", this.DatabaseTableCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

