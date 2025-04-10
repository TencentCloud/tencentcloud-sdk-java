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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosSnapShotInfo extends AbstractModel {

    /**
    * cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * base path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasePath")
    @Expose
    private String BasePath;

    /**
    * 快照名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 快照版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 普通[{"DataStreamName":"ilm-history-5","Is索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonIndexArr")
    @Expose
    private CommonIndexInfo [] CommonIndexArr;

    /**
    * 自治索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStreamArr")
    @Expose
    private DataStreamInfo [] DataStreamArr;

    /**
     * Get cos 桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucket cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucket cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get base path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasePath base path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBasePath() {
        return this.BasePath;
    }

    /**
     * Set base path
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasePath base path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasePath(String BasePath) {
        this.BasePath = BasePath;
    }

    /**
     * Get 快照名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotName 快照名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotName 快照名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 快照版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 快照版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 快照版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 快照版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 普通[{"DataStreamName":"ilm-history-5","Is索引信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonIndexArr 普通[{"DataStreamName":"ilm-history-5","Is索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CommonIndexInfo [] getCommonIndexArr() {
        return this.CommonIndexArr;
    }

    /**
     * Set 普通[{"DataStreamName":"ilm-history-5","Is索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonIndexArr 普通[{"DataStreamName":"ilm-history-5","Is索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonIndexArr(CommonIndexInfo [] CommonIndexArr) {
        this.CommonIndexArr = CommonIndexArr;
    }

    /**
     * Get 自治索引信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStreamArr 自治索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataStreamInfo [] getDataStreamArr() {
        return this.DataStreamArr;
    }

    /**
     * Set 自治索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStreamArr 自治索引信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStreamArr(DataStreamInfo [] DataStreamArr) {
        this.DataStreamArr = DataStreamArr;
    }

    public CosSnapShotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosSnapShotInfo(CosSnapShotInfo source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.BasePath != null) {
            this.BasePath = new String(source.BasePath);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.CommonIndexArr != null) {
            this.CommonIndexArr = new CommonIndexInfo[source.CommonIndexArr.length];
            for (int i = 0; i < source.CommonIndexArr.length; i++) {
                this.CommonIndexArr[i] = new CommonIndexInfo(source.CommonIndexArr[i]);
            }
        }
        if (source.DataStreamArr != null) {
            this.DataStreamArr = new DataStreamInfo[source.DataStreamArr.length];
            for (int i = 0; i < source.DataStreamArr.length; i++) {
                this.DataStreamArr[i] = new DataStreamInfo(source.DataStreamArr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "BasePath", this.BasePath);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "CommonIndexArr.", this.CommonIndexArr);
        this.setParamArrayObj(map, prefix + "DataStreamArr.", this.DataStreamArr);

    }
}

