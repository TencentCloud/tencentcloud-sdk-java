/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventLogDataRequest extends AbstractModel{

    /**
    * 防护类型，映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，最长跨度为30分钟
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
参数放空，表示查询全部动作数据
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 请求URL，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 地域 mainland 或者 overseas，为空时默认 mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 来源产品，cdn 或者 ecdn，为空时默认 cdn
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 防护类型，映射如下：
  waf = "Web攻击"
  cc = "CC攻击" 
     * @return Mode 防护类型，映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 防护类型，映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
     * @param Mode 防护类型，映射如下：
  waf = "Web攻击"
  cc = "CC攻击"
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，最长跨度为30分钟 
     * @return EndTime 结束时间，最长跨度为30分钟
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，最长跨度为30分钟
     * @param EndTime 结束时间，最长跨度为30分钟
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
参数放空，表示查询全部动作数据 
     * @return ActionName 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
参数放空，表示查询全部动作数据
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
参数放空，表示查询全部动作数据
     * @param ActionName 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
参数放空，表示查询全部动作数据
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 请求URL，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求 
     * @return Url 请求URL，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求URL，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     * @param Url 请求URL，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 地域 mainland 或者 overseas，为空时默认 mainland 
     * @return Area 地域 mainland 或者 overseas，为空时默认 mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域 mainland 或者 overseas，为空时默认 mainland
     * @param Area 地域 mainland 或者 overseas，为空时默认 mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 来源产品，cdn 或者 ecdn，为空时默认 cdn 
     * @return Source 来源产品，cdn 或者 ecdn，为空时默认 cdn
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源产品，cdn 或者 ecdn，为空时默认 cdn
     * @param Source 来源产品，cdn 或者 ecdn，为空时默认 cdn
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public DescribeEventLogDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventLogDataRequest(DescribeEventLogDataRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

