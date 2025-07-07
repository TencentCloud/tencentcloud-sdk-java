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
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由表名称。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表关联关系。
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * IPv4路由策略集合。
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * 是否默认路由表。
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * local路由是否发布云联网。
    */
    @SerializedName("LocalCidrForCcn")
    @Expose
    private CidrForCcn [] LocalCidrForCcn;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 路由表名称。 
     * @return RouteTableName 路由表名称。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set 路由表名称。
     * @param RouteTableName 路由表名称。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * Get 路由表关联关系。 
     * @return AssociationSet 路由表关联关系。
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * Set 路由表关联关系。
     * @param AssociationSet 路由表关联关系。
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * Get IPv4路由策略集合。 
     * @return RouteSet IPv4路由策略集合。
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * Set IPv4路由策略集合。
     * @param RouteSet IPv4路由策略集合。
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * Get 是否默认路由表。 
     * @return Main 是否默认路由表。
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * Set 是否默认路由表。
     * @param Main 是否默认路由表。
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get local路由是否发布云联网。 
     * @return LocalCidrForCcn local路由是否发布云联网。
     */
    public CidrForCcn [] getLocalCidrForCcn() {
        return this.LocalCidrForCcn;
    }

    /**
     * Set local路由是否发布云联网。
     * @param LocalCidrForCcn local路由是否发布云联网。
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

