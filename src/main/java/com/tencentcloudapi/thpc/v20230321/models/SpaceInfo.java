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
    * 工作空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 工作空间类型
    */
    @SerializedName("SpaceFamily")
    @Expose
    private String SpaceFamily;

    /**
    * 工作空间规格
    */
    @SerializedName("SpaceType")
    @Expose
    private String SpaceType;

    /**
    * 工作空间名称
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * 工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li>
    */
    @SerializedName("SpaceState")
    @Expose
    private String SpaceState;

    /**
    * 工作空间计费模式
    */
    @SerializedName("SpaceChargeType")
    @Expose
    private String SpaceChargeType;

    /**
    * 工作空间对应资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自动续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 工作空间关联的工作列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 工作空间所在位置
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 工作空间的最新操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 工作空间的最新操作状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
     * Get 工作空间ID 
     * @return SpaceId 工作空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 工作空间ID
     * @param SpaceId 工作空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 工作空间类型 
     * @return SpaceFamily 工作空间类型
     */
    public String getSpaceFamily() {
        return this.SpaceFamily;
    }

    /**
     * Set 工作空间类型
     * @param SpaceFamily 工作空间类型
     */
    public void setSpaceFamily(String SpaceFamily) {
        this.SpaceFamily = SpaceFamily;
    }

    /**
     * Get 工作空间规格 
     * @return SpaceType 工作空间规格
     */
    public String getSpaceType() {
        return this.SpaceType;
    }

    /**
     * Set 工作空间规格
     * @param SpaceType 工作空间规格
     */
    public void setSpaceType(String SpaceType) {
        this.SpaceType = SpaceType;
    }

    /**
     * Get 工作空间名称 
     * @return SpaceName 工作空间名称
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 工作空间名称
     * @param SpaceName 工作空间名称
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get 工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li> 
     * @return SpaceState 工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li>
     */
    public String getSpaceState() {
        return this.SpaceState;
    }

    /**
     * Set 工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li>
     * @param SpaceState 工作空间状态。取值范围：<br><li>PENDING：表示创建中<br></li><li>LAUNCH_FAILED：表示创建失败<br></li><li>ONLINE：表示运行中<br></li><li>ARREARS：表示隔离中<br></li><li>TERMINATING：表示销毁中。<br></li>
     */
    public void setSpaceState(String SpaceState) {
        this.SpaceState = SpaceState;
    }

    /**
     * Get 工作空间计费模式 
     * @return SpaceChargeType 工作空间计费模式
     */
    public String getSpaceChargeType() {
        return this.SpaceChargeType;
    }

    /**
     * Set 工作空间计费模式
     * @param SpaceChargeType 工作空间计费模式
     */
    public void setSpaceChargeType(String SpaceChargeType) {
        this.SpaceChargeType = SpaceChargeType;
    }

    /**
     * Get 工作空间对应资源ID 
     * @return ResourceId 工作空间对应资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 工作空间对应资源ID
     * @param ResourceId 工作空间对应资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自动续费标识 
     * @return RenewFlag 自动续费标识
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识
     * @param RenewFlag 自动续费标识
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 工作空间关联的工作列表 
     * @return Tags 工作空间关联的工作列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 工作空间关联的工作列表
     * @param Tags 工作空间关联的工作列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 到期时间 
     * @return ExpiredTime 到期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 到期时间
     * @param ExpiredTime 到期时间
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 工作空间所在位置 
     * @return Placement 工作空间所在位置
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 工作空间所在位置
     * @param Placement 工作空间所在位置
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 工作空间的最新操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 工作空间的最新操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 工作空间的最新操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 工作空间的最新操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 工作空间的最新操作状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 工作空间的最新操作状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 工作空间的最新操作状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 工作空间的最新操作状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
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

    }
}

