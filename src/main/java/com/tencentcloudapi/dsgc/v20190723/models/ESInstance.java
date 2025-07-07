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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESInstance extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 扫描任务ID
    */
    @SerializedName("DiscoveryTaskId")
    @Expose
    private Long DiscoveryTaskId;

    /**
    * 扫描任务实例ID
    */
    @SerializedName("DiscoveryTaskInstanceID")
    @Expose
    private Long DiscoveryTaskInstanceID;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据源类型 
     * @return DataSourceType 数据源类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
     * @param DataSourceType 数据源类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 地域 
     * @return ResourceRegion 地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 地域
     * @param ResourceRegion 地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 扫描任务ID 
     * @return DiscoveryTaskId 扫描任务ID
     */
    public Long getDiscoveryTaskId() {
        return this.DiscoveryTaskId;
    }

    /**
     * Set 扫描任务ID
     * @param DiscoveryTaskId 扫描任务ID
     */
    public void setDiscoveryTaskId(Long DiscoveryTaskId) {
        this.DiscoveryTaskId = DiscoveryTaskId;
    }

    /**
     * Get 扫描任务实例ID 
     * @return DiscoveryTaskInstanceID 扫描任务实例ID
     */
    public Long getDiscoveryTaskInstanceID() {
        return this.DiscoveryTaskInstanceID;
    }

    /**
     * Set 扫描任务实例ID
     * @param DiscoveryTaskInstanceID 扫描任务实例ID
     */
    public void setDiscoveryTaskInstanceID(Long DiscoveryTaskInstanceID) {
        this.DiscoveryTaskInstanceID = DiscoveryTaskInstanceID;
    }

    public ESInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESInstance(ESInstance source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DiscoveryTaskId != null) {
            this.DiscoveryTaskId = new Long(source.DiscoveryTaskId);
        }
        if (source.DiscoveryTaskInstanceID != null) {
            this.DiscoveryTaskInstanceID = new Long(source.DiscoveryTaskInstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "DiscoveryTaskId", this.DiscoveryTaskId);
        this.setParamSimple(map, prefix + "DiscoveryTaskInstanceID", this.DiscoveryTaskInstanceID);

    }
}

