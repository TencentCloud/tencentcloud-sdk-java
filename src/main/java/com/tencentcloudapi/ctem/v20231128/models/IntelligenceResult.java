/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceResult extends AbstractModel {

    /**
    * <p>客户ID</p>
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * <p>客户名称</p>
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>指纹</p>
    */
    @SerializedName("Banner")
    @Expose
    private String Banner;

    /**
    * <p>截图预览</p>
    */
    @SerializedName("ScreenshotUrl")
    @Expose
    private String ScreenshotUrl;

    /**
    * <p>是否受影响</p>
    */
    @SerializedName("IsAffected")
    @Expose
    private Boolean IsAffected;

    /**
    * <p>网址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>客户ID</p> 
     * @return CustomerId <p>客户ID</p>
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set <p>客户ID</p>
     * @param CustomerId <p>客户ID</p>
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get <p>客户名称</p> 
     * @return CustomerName <p>客户名称</p>
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set <p>客户名称</p>
     * @param CustomerName <p>客户名称</p>
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>指纹</p> 
     * @return Banner <p>指纹</p>
     */
    public String getBanner() {
        return this.Banner;
    }

    /**
     * Set <p>指纹</p>
     * @param Banner <p>指纹</p>
     */
    public void setBanner(String Banner) {
        this.Banner = Banner;
    }

    /**
     * Get <p>截图预览</p> 
     * @return ScreenshotUrl <p>截图预览</p>
     */
    public String getScreenshotUrl() {
        return this.ScreenshotUrl;
    }

    /**
     * Set <p>截图预览</p>
     * @param ScreenshotUrl <p>截图预览</p>
     */
    public void setScreenshotUrl(String ScreenshotUrl) {
        this.ScreenshotUrl = ScreenshotUrl;
    }

    /**
     * Get <p>是否受影响</p> 
     * @return IsAffected <p>是否受影响</p>
     */
    public Boolean getIsAffected() {
        return this.IsAffected;
    }

    /**
     * Set <p>是否受影响</p>
     * @param IsAffected <p>是否受影响</p>
     */
    public void setIsAffected(Boolean IsAffected) {
        this.IsAffected = IsAffected;
    }

    /**
     * Get <p>网址</p> 
     * @return Url <p>网址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>网址</p>
     * @param Url <p>网址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public IntelligenceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceResult(IntelligenceResult source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Banner != null) {
            this.Banner = new String(source.Banner);
        }
        if (source.ScreenshotUrl != null) {
            this.ScreenshotUrl = new String(source.ScreenshotUrl);
        }
        if (source.IsAffected != null) {
            this.IsAffected = new Boolean(source.IsAffected);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Banner", this.Banner);
        this.setParamSimple(map, prefix + "ScreenshotUrl", this.ScreenshotUrl);
        this.setParamSimple(map, prefix + "IsAffected", this.IsAffected);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

