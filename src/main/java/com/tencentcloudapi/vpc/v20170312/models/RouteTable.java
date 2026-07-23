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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteTable extends AbstractModel {

    /**
    * <p>VPC实例ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>路由表实例ID，例如：rtb-azd4dt1c。</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>路由表名称。</p>
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * <p>路由表关联关系。</p>
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * <p>IPv4路由策略集合。</p>
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * <p>是否默认路由表。</p>
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>标签键值对。</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>local路由是否发布云联网。</p>
    */
    @SerializedName("LocalCidrForCcn")
    @Expose
    private CidrForCcn [] LocalCidrForCcn;

    /**
     * Get <p>VPC实例ID。</p> 
     * @return VpcId <p>VPC实例ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。</p>
     * @param VpcId <p>VPC实例ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>路由表实例ID，例如：rtb-azd4dt1c。</p> 
     * @return RouteTableId <p>路由表实例ID，例如：rtb-azd4dt1c。</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>路由表实例ID，例如：rtb-azd4dt1c。</p>
     * @param RouteTableId <p>路由表实例ID，例如：rtb-azd4dt1c。</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get <p>路由表名称。</p> 
     * @return RouteTableName <p>路由表名称。</p>
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set <p>路由表名称。</p>
     * @param RouteTableName <p>路由表名称。</p>
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get <p>路由表关联关系。</p> 
     * @return AssociationSet <p>路由表关联关系。</p>
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * Set <p>路由表关联关系。</p>
     * @param AssociationSet <p>路由表关联关系。</p>
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * Get <p>IPv4路由策略集合。</p> 
     * @return RouteSet <p>IPv4路由策略集合。</p>
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * Set <p>IPv4路由策略集合。</p>
     * @param RouteSet <p>IPv4路由策略集合。</p>
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * Get <p>是否默认路由表。</p> 
     * @return Main <p>是否默认路由表。</p>
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set <p>是否默认路由表。</p>
     * @param Main <p>是否默认路由表。</p>
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>标签键值对。</p> 
     * @return TagSet <p>标签键值对。</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签键值对。</p>
     * @param TagSet <p>标签键值对。</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>local路由是否发布云联网。</p> 
     * @return LocalCidrForCcn <p>local路由是否发布云联网。</p>
     */
    public CidrForCcn [] getLocalCidrForCcn() {
        return this.LocalCidrForCcn;
    }

    /**
     * Set <p>local路由是否发布云联网。</p>
     * @param LocalCidrForCcn <p>local路由是否发布云联网。</p>
     */
    public void setLocalCidrForCcn(CidrForCcn [] LocalCidrForCcn) {
        this.LocalCidrForCcn = LocalCidrForCcn;
    }

    public RouteTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteTable(RouteTable source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
        }
        if (source.AssociationSet != null) {
            this.AssociationSet = new RouteTableAssociation[source.AssociationSet.length];
            for (int i = 0; i < source.AssociationSet.length; i++) {
                this.AssociationSet[i] = new RouteTableAssociation(source.AssociationSet[i]);
            }
        }
        if (source.RouteSet != null) {
            this.RouteSet = new Route[source.RouteSet.length];
            for (int i = 0; i < source.RouteSet.length; i++) {
                this.RouteSet[i] = new Route(source.RouteSet[i]);
            }
        }
        if (source.Main != null) {
            this.Main = new Boolean(source.Main);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.LocalCidrForCcn != null) {
            this.LocalCidrForCcn = new CidrForCcn[source.LocalCidrForCcn.length];
            for (int i = 0; i < source.LocalCidrForCcn.length; i++) {
                this.LocalCidrForCcn[i] = new CidrForCcn(source.LocalCidrForCcn[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "AssociationSet.", this.AssociationSet);
        this.setParamArrayObj(map, prefix + "RouteSet.", this.RouteSet);
        this.setParamSimple(map, prefix + "Main", this.Main);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "LocalCidrForCcn.", this.LocalCidrForCcn);

    }
}

