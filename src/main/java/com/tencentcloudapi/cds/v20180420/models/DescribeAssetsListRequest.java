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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetsListRequest extends AbstractModel {

    /**
    * <p>限制数目</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>实例Id/实例名称/资产名称</p>
    */
    @SerializedName("SearchValues")
    @Expose
    private NameValueString [] SearchValues;

    /**
    * <p>数据资产类型</p>
    */
    @SerializedName("AssetsType")
    @Expose
    private String AssetsType;

    /**
    * <p>查询的资产类型（1:cdb、2:cvm、3:others）</p>
    */
    @SerializedName("AssetsAddType")
    @Expose
    private Long AssetsAddType;

    /**
    * <p>地域</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>审计权限</p>
    */
    @SerializedName("Permission")
    @Expose
    private Long Permission;

    /**
    * <p>状态</p>
    */
    @SerializedName("AliveStatus")
    @Expose
    private Long AliveStatus;

    /**
    * <p>1.代理开启 0.代理关闭 -1.全查</p>
    */
    @SerializedName("CasbOn")
    @Expose
    private Long CasbOn;

    /**
    * <p>1.Agent开启 0.Agent关闭 -1.全查</p>
    */
    @SerializedName("AgentOn")
    @Expose
    private Long AgentOn;

    /**
    * <p>0.关闭，1.开启，2.关闭中，3.开启中 -1.全查</p>
    */
    @SerializedName("CdbOn")
    @Expose
    private Long CdbOn;

    /**
    * <p>扩展分类，如sensitive，指定查询支持敏感数据识别的资产</p>
    */
    @SerializedName("ExtendCategory")
    @Expose
    private String ExtendCategory;

    /**
    * <p>资产组Id（Id=0 暂未分组；id&gt;0 组Id）</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * <p>资产Id</p>
    */
    @SerializedName("Aids")
    @Expose
    private Long [] Aids;

    /**
    * <p>查询绑定状态（1:查询规则绑定数量；2:查询模型绑定数量）</p>
    */
    @SerializedName("BindingState")
    @Expose
    private Long BindingState;

    /**
    * <p>网卡是否开启流量审计</p><p>取值范围：[-1, 1]</p>
    */
    @SerializedName("TrafficMirrorOn")
    @Expose
    private Long TrafficMirrorOn;

    /**
     * Get <p>限制数目</p> 
     * @return Limit <p>限制数目</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目</p>
     * @param Limit <p>限制数目</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>实例Id/实例名称/资产名称</p> 
     * @return SearchValues <p>实例Id/实例名称/资产名称</p>
     */
    public NameValueString [] getSearchValues() {
        return this.SearchValues;
    }

    /**
     * Set <p>实例Id/实例名称/资产名称</p>
     * @param SearchValues <p>实例Id/实例名称/资产名称</p>
     */
    public void setSearchValues(NameValueString [] SearchValues) {
        this.SearchValues = SearchValues;
    }

    /**
     * Get <p>数据资产类型</p> 
     * @return AssetsType <p>数据资产类型</p>
     */
    public String getAssetsType() {
        return this.AssetsType;
    }

    /**
     * Set <p>数据资产类型</p>
     * @param AssetsType <p>数据资产类型</p>
     */
    public void setAssetsType(String AssetsType) {
        this.AssetsType = AssetsType;
    }

    /**
     * Get <p>查询的资产类型（1:cdb、2:cvm、3:others）</p> 
     * @return AssetsAddType <p>查询的资产类型（1:cdb、2:cvm、3:others）</p>
     */
    public Long getAssetsAddType() {
        return this.AssetsAddType;
    }

    /**
     * Set <p>查询的资产类型（1:cdb、2:cvm、3:others）</p>
     * @param AssetsAddType <p>查询的资产类型（1:cdb、2:cvm、3:others）</p>
     */
    public void setAssetsAddType(Long AssetsAddType) {
        this.AssetsAddType = AssetsAddType;
    }

    /**
     * Get <p>地域</p> 
     * @return RegionId <p>地域</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域</p>
     * @param RegionId <p>地域</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>审计权限</p> 
     * @return Permission <p>审计权限</p>
     */
    public Long getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>审计权限</p>
     * @param Permission <p>审计权限</p>
     */
    public void setPermission(Long Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>状态</p> 
     * @return AliveStatus <p>状态</p>
     */
    public Long getAliveStatus() {
        return this.AliveStatus;
    }

    /**
     * Set <p>状态</p>
     * @param AliveStatus <p>状态</p>
     */
    public void setAliveStatus(Long AliveStatus) {
        this.AliveStatus = AliveStatus;
    }

    /**
     * Get <p>1.代理开启 0.代理关闭 -1.全查</p> 
     * @return CasbOn <p>1.代理开启 0.代理关闭 -1.全查</p>
     */
    public Long getCasbOn() {
        return this.CasbOn;
    }

    /**
     * Set <p>1.代理开启 0.代理关闭 -1.全查</p>
     * @param CasbOn <p>1.代理开启 0.代理关闭 -1.全查</p>
     */
    public void setCasbOn(Long CasbOn) {
        this.CasbOn = CasbOn;
    }

    /**
     * Get <p>1.Agent开启 0.Agent关闭 -1.全查</p> 
     * @return AgentOn <p>1.Agent开启 0.Agent关闭 -1.全查</p>
     */
    public Long getAgentOn() {
        return this.AgentOn;
    }

    /**
     * Set <p>1.Agent开启 0.Agent关闭 -1.全查</p>
     * @param AgentOn <p>1.Agent开启 0.Agent关闭 -1.全查</p>
     */
    public void setAgentOn(Long AgentOn) {
        this.AgentOn = AgentOn;
    }

    /**
     * Get <p>0.关闭，1.开启，2.关闭中，3.开启中 -1.全查</p> 
     * @return CdbOn <p>0.关闭，1.开启，2.关闭中，3.开启中 -1.全查</p>
     */
    public Long getCdbOn() {
        return this.CdbOn;
    }

    /**
     * Set <p>0.关闭，1.开启，2.关闭中，3.开启中 -1.全查</p>
     * @param CdbOn <p>0.关闭，1.开启，2.关闭中，3.开启中 -1.全查</p>
     */
    public void setCdbOn(Long CdbOn) {
        this.CdbOn = CdbOn;
    }

    /**
     * Get <p>扩展分类，如sensitive，指定查询支持敏感数据识别的资产</p> 
     * @return ExtendCategory <p>扩展分类，如sensitive，指定查询支持敏感数据识别的资产</p>
     */
    public String getExtendCategory() {
        return this.ExtendCategory;
    }

    /**
     * Set <p>扩展分类，如sensitive，指定查询支持敏感数据识别的资产</p>
     * @param ExtendCategory <p>扩展分类，如sensitive，指定查询支持敏感数据识别的资产</p>
     */
    public void setExtendCategory(String ExtendCategory) {
        this.ExtendCategory = ExtendCategory;
    }

    /**
     * Get <p>资产组Id（Id=0 暂未分组；id&gt;0 组Id）</p> 
     * @return GroupIds <p>资产组Id（Id=0 暂未分组；id&gt;0 组Id）</p>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>资产组Id（Id=0 暂未分组；id&gt;0 组Id）</p>
     * @param GroupIds <p>资产组Id（Id=0 暂未分组；id&gt;0 组Id）</p>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>资产Id</p> 
     * @return Aids <p>资产Id</p>
     */
    public Long [] getAids() {
        return this.Aids;
    }

    /**
     * Set <p>资产Id</p>
     * @param Aids <p>资产Id</p>
     */
    public void setAids(Long [] Aids) {
        this.Aids = Aids;
    }

    /**
     * Get <p>查询绑定状态（1:查询规则绑定数量；2:查询模型绑定数量）</p> 
     * @return BindingState <p>查询绑定状态（1:查询规则绑定数量；2:查询模型绑定数量）</p>
     */
    public Long getBindingState() {
        return this.BindingState;
    }

    /**
     * Set <p>查询绑定状态（1:查询规则绑定数量；2:查询模型绑定数量）</p>
     * @param BindingState <p>查询绑定状态（1:查询规则绑定数量；2:查询模型绑定数量）</p>
     */
    public void setBindingState(Long BindingState) {
        this.BindingState = BindingState;
    }

    /**
     * Get <p>网卡是否开启流量审计</p><p>取值范围：[-1, 1]</p> 
     * @return TrafficMirrorOn <p>网卡是否开启流量审计</p><p>取值范围：[-1, 1]</p>
     */
    public Long getTrafficMirrorOn() {
        return this.TrafficMirrorOn;
    }

    /**
     * Set <p>网卡是否开启流量审计</p><p>取值范围：[-1, 1]</p>
     * @param TrafficMirrorOn <p>网卡是否开启流量审计</p><p>取值范围：[-1, 1]</p>
     */
    public void setTrafficMirrorOn(Long TrafficMirrorOn) {
        this.TrafficMirrorOn = TrafficMirrorOn;
    }

    public DescribeAssetsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetsListRequest(DescribeAssetsListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchValues != null) {
            this.SearchValues = new NameValueString[source.SearchValues.length];
            for (int i = 0; i < source.SearchValues.length; i++) {
                this.SearchValues[i] = new NameValueString(source.SearchValues[i]);
            }
        }
        if (source.AssetsType != null) {
            this.AssetsType = new String(source.AssetsType);
        }
        if (source.AssetsAddType != null) {
            this.AssetsAddType = new Long(source.AssetsAddType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.Permission != null) {
            this.Permission = new Long(source.Permission);
        }
        if (source.AliveStatus != null) {
            this.AliveStatus = new Long(source.AliveStatus);
        }
        if (source.CasbOn != null) {
            this.CasbOn = new Long(source.CasbOn);
        }
        if (source.AgentOn != null) {
            this.AgentOn = new Long(source.AgentOn);
        }
        if (source.CdbOn != null) {
            this.CdbOn = new Long(source.CdbOn);
        }
        if (source.ExtendCategory != null) {
            this.ExtendCategory = new String(source.ExtendCategory);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.Aids != null) {
            this.Aids = new Long[source.Aids.length];
            for (int i = 0; i < source.Aids.length; i++) {
                this.Aids[i] = new Long(source.Aids[i]);
            }
        }
        if (source.BindingState != null) {
            this.BindingState = new Long(source.BindingState);
        }
        if (source.TrafficMirrorOn != null) {
            this.TrafficMirrorOn = new Long(source.TrafficMirrorOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "SearchValues.", this.SearchValues);
        this.setParamSimple(map, prefix + "AssetsType", this.AssetsType);
        this.setParamSimple(map, prefix + "AssetsAddType", this.AssetsAddType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "AliveStatus", this.AliveStatus);
        this.setParamSimple(map, prefix + "CasbOn", this.CasbOn);
        this.setParamSimple(map, prefix + "AgentOn", this.AgentOn);
        this.setParamSimple(map, prefix + "CdbOn", this.CdbOn);
        this.setParamSimple(map, prefix + "ExtendCategory", this.ExtendCategory);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "Aids.", this.Aids);
        this.setParamSimple(map, prefix + "BindingState", this.BindingState);
        this.setParamSimple(map, prefix + "TrafficMirrorOn", this.TrafficMirrorOn);

    }
}

