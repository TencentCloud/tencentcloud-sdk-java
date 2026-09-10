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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyAuthConfig extends AbstractModel {

    /**
    * <p>Access Key字段配置</p>
    */
    @SerializedName("ParamList")
    @Expose
    private AccessKeyParamConfig [] ParamList;

    /**
    * <p>Access Key透传配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassThroughConfig")
    @Expose
    private AccessKeyPassThroughConfig PassThroughConfig;

    /**
    * <p>Access Key 使用模式</p><p>枚举值：</p><ul><li>1： Access Key透传</li></ul>
    */
    @SerializedName("UsageMode")
    @Expose
    private Long UsageMode;

    /**
     * Get <p>Access Key字段配置</p> 
     * @return ParamList <p>Access Key字段配置</p>
     */
    public AccessKeyParamConfig [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>Access Key字段配置</p>
     * @param ParamList <p>Access Key字段配置</p>
     */
    public void setParamList(AccessKeyParamConfig [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>Access Key透传配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassThroughConfig <p>Access Key透传配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessKeyPassThroughConfig getPassThroughConfig() {
        return this.PassThroughConfig;
    }

    /**
     * Set <p>Access Key透传配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassThroughConfig <p>Access Key透传配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassThroughConfig(AccessKeyPassThroughConfig PassThroughConfig) {
        this.PassThroughConfig = PassThroughConfig;
    }

    /**
     * Get <p>Access Key 使用模式</p><p>枚举值：</p><ul><li>1： Access Key透传</li></ul> 
     * @return UsageMode <p>Access Key 使用模式</p><p>枚举值：</p><ul><li>1： Access Key透传</li></ul>
     */
    public Long getUsageMode() {
        return this.UsageMode;
    }

    /**
     * Set <p>Access Key 使用模式</p><p>枚举值：</p><ul><li>1： Access Key透传</li></ul>
     * @param UsageMode <p>Access Key 使用模式</p><p>枚举值：</p><ul><li>1： Access Key透传</li></ul>
     */
    public void setUsageMode(Long UsageMode) {
        this.UsageMode = UsageMode;
    }

    public AccessKeyAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAuthConfig(AccessKeyAuthConfig source) {
        if (source.ParamList != null) {
            this.ParamList = new AccessKeyParamConfig[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new AccessKeyParamConfig(source.ParamList[i]);
            }
        }
        if (source.PassThroughConfig != null) {
            this.PassThroughConfig = new AccessKeyPassThroughConfig(source.PassThroughConfig);
        }
        if (source.UsageMode != null) {
            this.UsageMode = new Long(source.UsageMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamObj(map, prefix + "PassThroughConfig.", this.PassThroughConfig);
        this.setParamSimple(map, prefix + "UsageMode", this.UsageMode);

    }
}

