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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceListRequest extends AbstractModel {

    /**
    * <p>设备所属项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>设备类型筛选，不填默认为全部设备类型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配</p>
    */
    @SerializedName("SearchWords")
    @Expose
    private String SearchWords;

    /**
    * <p>每页返回的最大设备数，不填默认为10</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>当前页码，不填默认为1（首页）</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>设备状态筛选，不填默认为不过滤。取值：[&quot;ready&quot;,&quot;connected&quot;,&quot;online&quot;]，online代表ready或connected</p>
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * <p>标识查询项目下的设备注册类型，默认不包含免注册登录设备。 若存在免注册登录设备，该参数传&quot;1&quot;</p><p>枚举值：</p><ul><li>0： 项目不包含免注册登录设备</li><li>1： 项目包含免注册登录设备</li></ul><p>默认值：0</p>
    */
    @SerializedName("RegisterType")
    @Expose
    private Long RegisterType;

    /**
     * Get <p>设备所属项目ID</p> 
     * @return ProjectId <p>设备所属项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>设备所属项目ID</p>
     * @param ProjectId <p>设备所属项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>设备类型筛选，不填默认为全部设备类型</p> 
     * @return DeviceType <p>设备类型筛选，不填默认为全部设备类型</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>设备类型筛选，不填默认为全部设备类型</p>
     * @param DeviceType <p>设备类型筛选，不填默认为全部设备类型</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配</p> 
     * @return SearchWords <p>对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配</p>
     */
    public String getSearchWords() {
        return this.SearchWords;
    }

    /**
     * Set <p>对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配</p>
     * @param SearchWords <p>对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配</p>
     */
    public void setSearchWords(String SearchWords) {
        this.SearchWords = SearchWords;
    }

    /**
     * Get <p>每页返回的最大设备数，不填默认为10</p> 
     * @return PageSize <p>每页返回的最大设备数，不填默认为10</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页返回的最大设备数，不填默认为10</p>
     * @param PageSize <p>每页返回的最大设备数，不填默认为10</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>当前页码，不填默认为1（首页）</p> 
     * @return PageNumber <p>当前页码，不填默认为1（首页）</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>当前页码，不填默认为1（首页）</p>
     * @param PageNumber <p>当前页码，不填默认为1（首页）</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>设备状态筛选，不填默认为不过滤。取值：[&quot;ready&quot;,&quot;connected&quot;,&quot;online&quot;]，online代表ready或connected</p> 
     * @return DeviceStatus <p>设备状态筛选，不填默认为不过滤。取值：[&quot;ready&quot;,&quot;connected&quot;,&quot;online&quot;]，online代表ready或connected</p>
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set <p>设备状态筛选，不填默认为不过滤。取值：[&quot;ready&quot;,&quot;connected&quot;,&quot;online&quot;]，online代表ready或connected</p>
     * @param DeviceStatus <p>设备状态筛选，不填默认为不过滤。取值：[&quot;ready&quot;,&quot;connected&quot;,&quot;online&quot;]，online代表ready或connected</p>
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get <p>标识查询项目下的设备注册类型，默认不包含免注册登录设备。 若存在免注册登录设备，该参数传&quot;1&quot;</p><p>枚举值：</p><ul><li>0： 项目不包含免注册登录设备</li><li>1： 项目包含免注册登录设备</li></ul><p>默认值：0</p> 
     * @return RegisterType <p>标识查询项目下的设备注册类型，默认不包含免注册登录设备。 若存在免注册登录设备，该参数传&quot;1&quot;</p><p>枚举值：</p><ul><li>0： 项目不包含免注册登录设备</li><li>1： 项目包含免注册登录设备</li></ul><p>默认值：0</p>
     */
    public Long getRegisterType() {
        return this.RegisterType;
    }

    /**
     * Set <p>标识查询项目下的设备注册类型，默认不包含免注册登录设备。 若存在免注册登录设备，该参数传&quot;1&quot;</p><p>枚举值：</p><ul><li>0： 项目不包含免注册登录设备</li><li>1： 项目包含免注册登录设备</li></ul><p>默认值：0</p>
     * @param RegisterType <p>标识查询项目下的设备注册类型，默认不包含免注册登录设备。 若存在免注册登录设备，该参数传&quot;1&quot;</p><p>枚举值：</p><ul><li>0： 项目不包含免注册登录设备</li><li>1： 项目包含免注册登录设备</li></ul><p>默认值：0</p>
     */
    public void setRegisterType(Long RegisterType) {
        this.RegisterType = RegisterType;
    }

    public DescribeDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceListRequest(DescribeDeviceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.SearchWords != null) {
            this.SearchWords = new String(source.SearchWords);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.RegisterType != null) {
            this.RegisterType = new Long(source.RegisterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "SearchWords", this.SearchWords);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "RegisterType", this.RegisterType);

    }
}

