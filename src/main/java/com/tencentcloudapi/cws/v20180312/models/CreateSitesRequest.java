package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateSitesRequest  extends AbstractModel{


    /**
    * 站点的url列表
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 访问网站的客户端标识
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
     * 获取站点的url列表
     * @return Urls 站点的url列表
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * 设置站点的url列表
     * @param Urls 站点的url列表
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * 获取访问网站的客户端标识
     * @return UserAgent 访问网站的客户端标识
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * 设置访问网站的客户端标识
     * @param UserAgent 访问网站的客户端标识
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);

    }
}

