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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerLabelFailure extends AbstractModel {

    /**
    * <p>失败项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private ConsumerLabelKey Key;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get <p>失败项标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key <p>失败项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerLabelKey getKey() {
        return this.Key;
    }

    /**
     * Set <p>失败项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key <p>失败项标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(ConsumerLabelKey Key) {
        this.Key = Key;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public ConsumerLabelFailure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLabelFailure(ConsumerLabelFailure source) {
        if (source.Key != null) {
            this.Key = new ConsumerLabelKey(source.Key);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Key.", this.Key);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

