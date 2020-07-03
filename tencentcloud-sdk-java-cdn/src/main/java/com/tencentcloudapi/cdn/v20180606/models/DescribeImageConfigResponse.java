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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageConfigResponse extends AbstractModel{

    /**
    * WebpAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebpAdapter")
    @Expose
    private WebpAdapter WebpAdapter;

    /**
    * TpgAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TpgAdapter")
    @Expose
    private TpgAdapter TpgAdapter;

    /**
    * GuetzliAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GuetzliAdapter")
    @Expose
    private GuetzliAdapter GuetzliAdapter;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get WebpAdapter配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebpAdapter WebpAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebpAdapter getWebpAdapter() {
        return this.WebpAdapter;
    }

    /**
     * Set WebpAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebpAdapter WebpAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebpAdapter(WebpAdapter WebpAdapter) {
        this.WebpAdapter = WebpAdapter;
    }

    /**
     * Get TpgAdapter配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TpgAdapter TpgAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TpgAdapter getTpgAdapter() {
        return this.TpgAdapter;
    }

    /**
     * Set TpgAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TpgAdapter TpgAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTpgAdapter(TpgAdapter TpgAdapter) {
        this.TpgAdapter = TpgAdapter;
    }

    /**
     * Get GuetzliAdapter配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GuetzliAdapter GuetzliAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GuetzliAdapter getGuetzliAdapter() {
        return this.GuetzliAdapter;
    }

    /**
     * Set GuetzliAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param GuetzliAdapter GuetzliAdapter配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGuetzliAdapter(GuetzliAdapter GuetzliAdapter) {
        this.GuetzliAdapter = GuetzliAdapter;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WebpAdapter.", this.WebpAdapter);
        this.setParamObj(map, prefix + "TpgAdapter.", this.TpgAdapter);
        this.setParamObj(map, prefix + "GuetzliAdapter.", this.GuetzliAdapter);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

