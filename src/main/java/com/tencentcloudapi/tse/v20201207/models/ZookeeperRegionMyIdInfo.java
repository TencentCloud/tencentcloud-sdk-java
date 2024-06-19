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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZookeeperRegionMyIdInfo extends AbstractModel {

    /**
    * 地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * myid 的起始号段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MyIdStart")
    @Expose
    private Long MyIdStart;

    /**
    * myid 的结束号段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MyIdEnd")
    @Expose
    private Long MyIdEnd;

    /**
     * Get 地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get myid 的起始号段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MyIdStart myid 的起始号段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMyIdStart() {
        return this.MyIdStart;
    }

    /**
     * Set myid 的起始号段
注意：此字段可能返回 null，表示取不到有效值。
     * @param MyIdStart myid 的起始号段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMyIdStart(Long MyIdStart) {
        this.MyIdStart = MyIdStart;
    }

    /**
     * Get myid 的结束号段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MyIdEnd myid 的结束号段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMyIdEnd() {
        return this.MyIdEnd;
    }

    /**
     * Set myid 的结束号段
注意：此字段可能返回 null，表示取不到有效值。
     * @param MyIdEnd myid 的结束号段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMyIdEnd(Long MyIdEnd) {
        this.MyIdEnd = MyIdEnd;
    }

    public ZookeeperRegionMyIdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZookeeperRegionMyIdInfo(ZookeeperRegionMyIdInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MyIdStart != null) {
            this.MyIdStart = new Long(source.MyIdStart);
        }
        if (source.MyIdEnd != null) {
            this.MyIdEnd = new Long(source.MyIdEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MyIdStart", this.MyIdStart);
        this.setParamSimple(map, prefix + "MyIdEnd", this.MyIdEnd);

    }
}

