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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimeOffsetInfo  extends AbstractModel{

    /**
    * 特定规格的指定时间点截图信息集合。目前每种规格只能有一套截图。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetSet")
    @Expose
    private MediaSnapshotByTimeOffsetItem [] SnapshotByTimeOffsetSet;

    /**
     * 获取特定规格的指定时间点截图信息集合。目前每种规格只能有一套截图。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SnapshotByTimeOffsetSet 特定规格的指定时间点截图信息集合。目前每种规格只能有一套截图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSnapshotByTimeOffsetItem [] getSnapshotByTimeOffsetSet() {
        return this.SnapshotByTimeOffsetSet;
    }

    /**
     * 设置特定规格的指定时间点截图信息集合。目前每种规格只能有一套截图。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetSet 特定规格的指定时间点截图信息集合。目前每种规格只能有一套截图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetSet(MediaSnapshotByTimeOffsetItem [] SnapshotByTimeOffsetSet) {
        this.SnapshotByTimeOffsetSet = SnapshotByTimeOffsetSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotByTimeOffsetSet.", this.SnapshotByTimeOffsetSet);

    }
}

