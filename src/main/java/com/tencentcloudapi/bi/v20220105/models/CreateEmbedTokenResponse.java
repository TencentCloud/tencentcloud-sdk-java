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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmbedTokenResponse extends AbstractModel{

    /**
    * 额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private EmbedTokenInfo Data;

    /**
    * 结果描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmbedTokenInfo getData() {
        return this.Data;
    }

    /**
     * Set 数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(EmbedTokenInfo Data) {
        this.Data = Data;
    }

    /**
     * Get 结果描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 结果描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 结果描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public CreateEmbedTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmbedTokenResponse(CreateEmbedTokenResponse source) {
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.Data != null) {
            this.Data = new EmbedTokenInfo(source.Data);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

