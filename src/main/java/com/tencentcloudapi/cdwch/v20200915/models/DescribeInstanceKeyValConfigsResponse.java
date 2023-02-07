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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceKeyValConfigsResponse extends AbstractModel{

    /**
    * 参数列表
    */
    @SerializedName("ConfigItems")
    @Expose
    private InstanceConfigInfo [] ConfigItems;

    /**
    * 未配置的参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnConfigItems")
    @Expose
    private InstanceConfigInfo [] UnConfigItems;

    /**
    * 配置的多层级参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MapConfigItems")
    @Expose
    private MapConfigItem [] MapConfigItems;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 参数列表 
     * @return ConfigItems 参数列表
     */
    public InstanceConfigInfo [] getConfigItems() {
        return this.ConfigItems;
    }

    /**
     * Set 参数列表
     * @param ConfigItems 参数列表
     */
    public void setConfigItems(InstanceConfigInfo [] ConfigItems) {
        this.ConfigItems = ConfigItems;
    }

    /**
     * Get 未配置的参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnConfigItems 未配置的参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceConfigInfo [] getUnConfigItems() {
        return this.UnConfigItems;
    }

    /**
     * Set 未配置的参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnConfigItems 未配置的参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnConfigItems(InstanceConfigInfo [] UnConfigItems) {
        this.UnConfigItems = UnConfigItems;
    }

    /**
     * Get 配置的多层级参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MapConfigItems 配置的多层级参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MapConfigItem [] getMapConfigItems() {
        return this.MapConfigItems;
    }

    /**
     * Set 配置的多层级参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MapConfigItems 配置的多层级参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMapConfigItems(MapConfigItem [] MapConfigItems) {
        this.MapConfigItems = MapConfigItems;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceKeyValConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceKeyValConfigsResponse(DescribeInstanceKeyValConfigsResponse source) {
        if (source.ConfigItems != null) {
            this.ConfigItems = new InstanceConfigInfo[source.ConfigItems.length];
            for (int i = 0; i < source.ConfigItems.length; i++) {
                this.ConfigItems[i] = new InstanceConfigInfo(source.ConfigItems[i]);
            }
        }
        if (source.UnConfigItems != null) {
            this.UnConfigItems = new InstanceConfigInfo[source.UnConfigItems.length];
            for (int i = 0; i < source.UnConfigItems.length; i++) {
                this.UnConfigItems[i] = new InstanceConfigInfo(source.UnConfigItems[i]);
            }
        }
        if (source.MapConfigItems != null) {
            this.MapConfigItems = new MapConfigItem[source.MapConfigItems.length];
            for (int i = 0; i < source.MapConfigItems.length; i++) {
                this.MapConfigItems[i] = new MapConfigItem(source.MapConfigItems[i]);
            }
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConfigItems.", this.ConfigItems);
        this.setParamArrayObj(map, prefix + "UnConfigItems.", this.UnConfigItems);
        this.setParamArrayObj(map, prefix + "MapConfigItems.", this.MapConfigItems);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

