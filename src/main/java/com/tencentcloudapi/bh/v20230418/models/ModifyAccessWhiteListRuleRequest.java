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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccessWhiteListRuleRequest extends AbstractModel {

    /**
    * 白名单规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * ip或网段信息，如10.10.10.1或10.10.10.0/24，最大长度40字节
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 备注信息，最大长度64字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 白名单规则ID 
     * @return Id 白名单规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 白名单规则ID
     * @param Id 白名单规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get ip或网段信息，如10.10.10.1或10.10.10.0/24，最大长度40字节 
     * @return Source ip或网段信息，如10.10.10.1或10.10.10.0/24，最大长度40字节
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set ip或网段信息，如10.10.10.1或10.10.10.0/24，最大长度40字节
     * @param Source ip或网段信息，如10.10.10.1或10.10.10.0/24，最大长度40字节
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 备注信息，最大长度64字符。 
     * @return Remark 备注信息，最大长度64字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最大长度64字符。
     * @param Remark 备注信息，最大长度64字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyAccessWhiteListRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccessWhiteListRuleRequest(ModifyAccessWhiteListRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

