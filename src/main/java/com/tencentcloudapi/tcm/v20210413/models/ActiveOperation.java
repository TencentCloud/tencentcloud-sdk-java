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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActiveOperation extends AbstractModel{

    /**
    * 操作Id
    */
    @SerializedName("OperationId")
    @Expose
    private String OperationId;

    /**
    * 操作类型，取值范围：
- LINK_CLUSTERS: 关联集群
- RELINK_CLUSTERS: 重新关联集群
- UNLINK_CLUSTERS: 解关联集群
- INSTALL_MESH: 安装网格
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 操作Id 
     * @return OperationId 操作Id
     */
    public String getOperationId() {
        return this.OperationId;
    }

    /**
     * Set 操作Id
     * @param OperationId 操作Id
     */
    public void setOperationId(String OperationId) {
        this.OperationId = OperationId;
    }

    /**
     * Get 操作类型，取值范围：
- LINK_CLUSTERS: 关联集群
- RELINK_CLUSTERS: 重新关联集群
- UNLINK_CLUSTERS: 解关联集群
- INSTALL_MESH: 安装网格 
     * @return Type 操作类型，取值范围：
- LINK_CLUSTERS: 关联集群
- RELINK_CLUSTERS: 重新关联集群
- UNLINK_CLUSTERS: 解关联集群
- INSTALL_MESH: 安装网格
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型，取值范围：
- LINK_CLUSTERS: 关联集群
- RELINK_CLUSTERS: 重新关联集群
- UNLINK_CLUSTERS: 解关联集群
- INSTALL_MESH: 安装网格
     * @param Type 操作类型，取值范围：
- LINK_CLUSTERS: 关联集群
- RELINK_CLUSTERS: 重新关联集群
- UNLINK_CLUSTERS: 解关联集群
- INSTALL_MESH: 安装网格
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ActiveOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActiveOperation(ActiveOperation source) {
        if (source.OperationId != null) {
            this.OperationId = new String(source.OperationId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationId", this.OperationId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

