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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroup extends AbstractModel {

    /**
    * <p>数据库代理组ID</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>数据库代理组节点个数</p>
    */
    @SerializedName("ProxyNodeCount")
    @Expose
    private Long ProxyNodeCount;

    /**
    * <p>数据库代理组状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>当前代理版本</p>
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>用户AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>读写节点开通数据库代理</p>
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数据库代理组ID</p> 
     * @return ProxyGroupId <p>数据库代理组ID</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>数据库代理组ID</p>
     * @param ProxyGroupId <p>数据库代理组ID</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>数据库代理组节点个数</p> 
     * @return ProxyNodeCount <p>数据库代理组节点个数</p>
     */
    public Long getProxyNodeCount() {
        return this.ProxyNodeCount;
    }

    /**
     * Set <p>数据库代理组节点个数</p>
     * @param ProxyNodeCount <p>数据库代理组节点个数</p>
     */
    public void setProxyNodeCount(Long ProxyNodeCount) {
        this.ProxyNodeCount = ProxyNodeCount;
    }

    /**
     * Get <p>数据库代理组状态</p> 
     * @return Status <p>数据库代理组状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据库代理组状态</p>
     * @param Status <p>数据库代理组状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>当前代理版本</p> 
     * @return CurrentProxyVersion <p>当前代理版本</p>
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set <p>当前代理版本</p>
     * @param CurrentProxyVersion <p>当前代理版本</p>
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>用户AppId</p> 
     * @return AppId <p>用户AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId</p>
     * @param AppId <p>用户AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>读写节点开通数据库代理</p> 
     * @return OpenRw <p>读写节点开通数据库代理</p>
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set <p>读写节点开通数据库代理</p>
     * @param OpenRw <p>读写节点开通数据库代理</p>
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProxyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroup(ProxyGroup source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCount != null) {
            this.ProxyNodeCount = new Long(source.ProxyNodeCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyNodeCount", this.ProxyNodeCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

