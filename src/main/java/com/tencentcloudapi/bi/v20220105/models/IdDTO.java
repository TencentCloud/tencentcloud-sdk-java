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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdDTO extends AbstractModel {

    /**
    * <p>请求id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>key</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>事务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * <p>事务状态</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 处理成功</li><li>3： 处理失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
     * Get <p>请求id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>请求id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>请求id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>请求id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>key</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKey <p>key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>key</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKey <p>key</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>事务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranId <p>事务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set <p>事务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranId <p>事务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get <p>事务状态</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 处理成功</li><li>3： 处理失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranStatus <p>事务状态</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 处理成功</li><li>3： 处理失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set <p>事务状态</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 处理成功</li><li>3： 处理失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranStatus <p>事务状态</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 处理成功</li><li>3： 处理失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    public IdDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdDTO(IdDTO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);

    }
}

