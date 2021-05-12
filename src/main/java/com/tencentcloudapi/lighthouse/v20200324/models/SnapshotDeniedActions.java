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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotDeniedActions extends AbstractModel{

    /**
    * 快照 ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 操作限制列表。
    */
    @SerializedName("DeniedActions")
    @Expose
    private DeniedAction [] DeniedActions;

    /**
     * Get 快照 ID。 
     * @return SnapshotId 快照 ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照 ID。
     * @param SnapshotId 快照 ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 操作限制列表。 
     * @return DeniedActions 操作限制列表。
     */
    public DeniedAction [] getDeniedActions() {
        return this.DeniedActions;
    }

    /**
     * Set 操作限制列表。
     * @param DeniedActions 操作限制列表。
     */
    public void setDeniedActions(DeniedAction [] DeniedActions) {
        this.DeniedActions = DeniedActions;
    }

    public SnapshotDeniedActions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotDeniedActions(SnapshotDeniedActions source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DeniedActions != null) {
            this.DeniedActions = new DeniedAction[source.DeniedActions.length];
            for (int i = 0; i < source.DeniedActions.length; i++) {
                this.DeniedActions[i] = new DeniedAction(source.DeniedActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamArrayObj(map, prefix + "DeniedActions.", this.DeniedActions);

    }
}

