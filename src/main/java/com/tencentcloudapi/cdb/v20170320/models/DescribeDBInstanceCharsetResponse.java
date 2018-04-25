package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBInstanceCharsetResponse  extends AbstractModel{


    /**
    * 实例的默认字符集，如"latin1", "utf8"等。
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取实例的默认字符集，如"latin1", "utf8"等。
     * @return Charset 实例的默认字符集，如"latin1", "utf8"等。
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * 设置实例的默认字符集，如"latin1", "utf8"等。
     * @param Charset 实例的默认字符集，如"latin1", "utf8"等。
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
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
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

