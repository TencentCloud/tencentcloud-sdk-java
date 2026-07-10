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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceInfo extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>工作空间类别</p>
    */
    @SerializedName("SpaceClass")
    @Expose
    private String SpaceClass;

    /**
    * <p>工作空间类型</p>
    */
    @SerializedName("SpaceFamily")
    @Expose
    private String SpaceFamily;

    /**
    * <p>工作空间规格</p>
    */
    @SerializedName("SpaceType")
    @Expose
    private String SpaceType;

    /**
    * <p>工作空间名称</p>
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * <p>工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li></p>
    */
    @SerializedName("SpaceState")
    @Expose
    private String SpaceState;

    /**
    * <p>工作空间计费模式</p>
    */
    @SerializedName("SpaceChargeType")
    @Expose
    private String SpaceChargeType;

    /**
    * <p>工作空间对应资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>自动续费标识</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>工作空间关联的工作列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>工作空间所在位置</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>工作空间的最新操作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * <p>工作空间的最新操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * <p>实例的内网IP</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
     * Get <p>工作空间ID</p> 
     * @return SpaceId <p>工作空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param SpaceId <p>工作空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>工作空间类别</p> 
     * @return SpaceClass <p>工作空间类别</p>
     */
    public String getSpaceClass() {
        return this.SpaceClass;
    }

    /**
     * Set <p>工作空间类别</p>
     * @param SpaceClass <p>工作空间类别</p>
     */
    public void setSpaceClass(String SpaceClass) {
        this.SpaceClass = SpaceClass;
    }

    /**
     * Get <p>工作空间类型</p> 
     * @return SpaceFamily <p>工作空间类型</p>
     */
    public String getSpaceFamily() {
        return this.SpaceFamily;
    }

    /**
     * Set <p>工作空间类型</p>
     * @param SpaceFamily <p>工作空间类型</p>
     */
    public void setSpaceFamily(String SpaceFamily) {
        this.SpaceFamily = SpaceFamily;
    }

    /**
     * Get <p>工作空间规格</p> 
     * @return SpaceType <p>工作空间规格</p>
     */
    public String getSpaceType() {
        return this.SpaceType;
    }

    /**
     * Set <p>工作空间规格</p>
     * @param SpaceType <p>工作空间规格</p>
     */
    public void setSpaceType(String SpaceType) {
        this.SpaceType = SpaceType;
    }

    /**
     * Get <p>工作空间名称</p> 
     * @return SpaceName <p>工作空间名称</p>
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set <p>工作空间名称</p>
     * @param SpaceName <p>工作空间名称</p>
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get <p>工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li></p> 
     * @return SpaceState <p>工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li></p>
     */
    public String getSpaceState() {
        return this.SpaceState;
    }

    /**
     * Set <p>工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li></p>
     * @param SpaceState <p>工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li></p>
     */
    public void setSpaceState(String SpaceState) {
        this.SpaceState = SpaceState;
    }

    /**
     * Get <p>工作空间计费模式</p> 
     * @return SpaceChargeType <p>工作空间计费模式</p>
     */
    public String getSpaceChargeType() {
        return this.SpaceChargeType;
    }

    /**
     * Set <p>工作空间计费模式</p>
     * @param SpaceChargeType <p>工作空间计费模式</p>
     */
    public void setSpaceChargeType(String SpaceChargeType) {
        this.SpaceChargeType = SpaceChargeType;
    }

    /**
     * Get <p>工作空间对应资源ID</p> 
     * @return ResourceId <p>工作空间对应资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>工作空间对应资源ID</p>
     * @param ResourceId <p>工作空间对应资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>自动续费标识</p> 
     * @return RenewFlag <p>自动续费标识</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识</p>
     * @param RenewFlag <p>自动续费标识</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>工作空间关联的工作列表</p> 
     * @return Tags <p>工作空间关联的工作列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>工作空间关联的工作列表</p>
     * @param Tags <p>工作空间关联的工作列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>到期时间</p> 
     * @return ExpiredTime <p>到期时间</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>到期时间</p>
     * @param ExpiredTime <p>到期时间</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>工作空间所在位置</p> 
     * @return Placement <p>工作空间所在位置</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>工作空间所在位置</p>
     * @param Placement <p>工作空间所在位置</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>工作空间的最新操作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation <p>工作空间的最新操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set <p>工作空间的最新操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation <p>工作空间的最新操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get <p>工作空间的最新操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState <p>工作空间的最新操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set <p>工作空间的最新操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState <p>工作空间的最新操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get <p>实例的内网IP</p> 
     * @return PrivateIpAddresses <p>实例的内网IP</p>
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>实例的内网IP</p>
     * @param PrivateIpAddresses <p>实例的内网IP</p>
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    public SpaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceInfo(SpaceInfo source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceClass != null) {
            this.SpaceClass = new String(source.SpaceClass);
        }
        if (source.SpaceFamily != null) {
            this.SpaceFamily = new String(source.SpaceFamily);
        }
        if (source.SpaceType != null) {
            this.SpaceType = new String(source.SpaceType);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.SpaceState != null) {
            this.SpaceState = new String(source.SpaceState);
        }
        if (source.SpaceChargeType != null) {
            this.SpaceChargeType = new String(source.SpaceChargeType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceClass", this.SpaceClass);
        this.setParamSimple(map, prefix + "SpaceFamily", this.SpaceFamily);
        this.setParamSimple(map, prefix + "SpaceType", this.SpaceType);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "SpaceState", this.SpaceState);
        this.setParamSimple(map, prefix + "SpaceChargeType", this.SpaceChargeType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);

    }
}

