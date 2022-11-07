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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRTMPPullSettings extends AbstractModel{

    /**
    * 拉流地址列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerUrls")
    @Expose
    private DescribeOutputRTMPPullServerUrl [] ServerUrls;

    /**
     * Get 拉流地址列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerUrls 拉流地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutputRTMPPullServerUrl [] getServerUrls() {
        return this.ServerUrls;
    }

    /**
     * Set 拉流地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerUrls 拉流地址列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerUrls(DescribeOutputRTMPPullServerUrl [] ServerUrls) {
        this.ServerUrls = ServerUrls;
    }

    public DescribeOutputRTMPPullSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTMPPullSettings(DescribeOutputRTMPPullSettings source) {
        if (source.ServerUrls != null) {
            this.ServerUrls = new DescribeOutputRTMPPullServerUrl[source.ServerUrls.length];
            for (int i = 0; i < source.ServerUrls.length; i++) {
                this.ServerUrls[i] = new DescribeOutputRTMPPullServerUrl(source.ServerUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServerUrls.", this.ServerUrls);

    }
}

