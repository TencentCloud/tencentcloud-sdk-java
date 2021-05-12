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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiUseDetailRequest extends AbstractModel{

    /**
    * 网关部署组ID
    */
    @SerializedName("GatewayDeployGroupId")
    @Expose
    private String GatewayDeployGroupId;

    /**
    * 网关分组Api ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 查询的日期,格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询的日期,格式：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 网关部署组ID 
     * @return GatewayDeployGroupId 网关部署组ID
     */
    public String getGatewayDeployGroupId() {
        return this.GatewayDeployGroupId;
    }

    /**
     * Set 网关部署组ID
     * @param GatewayDeployGroupId 网关部署组ID
     */
    public void setGatewayDeployGroupId(String GatewayDeployGroupId) {
        this.GatewayDeployGroupId = GatewayDeployGroupId;
    }

    /**
     * Get 网关分组Api ID 
     * @return ApiId 网关分组Api ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set 网关分组Api ID
     * @param ApiId 网关分组Api ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 查询的日期,格式：yyyy-MM-dd HH:mm:ss 
     * @return StartTime 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     * @param StartTime 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询的日期,格式：yyyy-MM-dd HH:mm:ss 
     * @return EndTime 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     * @param EndTime 查询的日期,格式：yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeApiUseDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiUseDetailRequest(DescribeApiUseDetailRequest source) {
        if (source.GatewayDeployGroupId != null) {
            this.GatewayDeployGroupId = new String(source.GatewayDeployGroupId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayDeployGroupId", this.GatewayDeployGroupId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

