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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountRequest extends AbstractModel {

    /**
    * <p>平台 Id，指定访问的平台。关于平台概念，请参见文档 <a href="https://cloud.tencent.com/document/product/1156/43767">平台</a>。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>用户标识 。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>操作者。如不填，默认为 <code>cmeid_system</code>，表示平台管理员操作，可以操作任意账户。如果指定操作者，则操作者必须为账户所有者。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get <p>平台 Id，指定访问的平台。关于平台概念，请参见文档 <a href="https://cloud.tencent.com/document/product/1156/43767">平台</a>。</p> 
     * @return Platform <p>平台 Id，指定访问的平台。关于平台概念，请参见文档 <a href="https://cloud.tencent.com/document/product/1156/43767">平台</a>。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台 Id，指定访问的平台。关于平台概念，请参见文档 <a href="https://cloud.tencent.com/document/product/1156/43767">平台</a>。</p>
     * @param Platform <p>平台 Id，指定访问的平台。关于平台概念，请参见文档 <a href="https://cloud.tencent.com/document/product/1156/43767">平台</a>。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>用户标识 。</p> 
     * @return UserId <p>用户标识 。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户标识 。</p>
     * @param UserId <p>用户标识 。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>操作者。如不填，默认为 <code>cmeid_system</code>，表示平台管理员操作，可以操作任意账户。如果指定操作者，则操作者必须为账户所有者。</p> 
     * @return Operator <p>操作者。如不填，默认为 <code>cmeid_system</code>，表示平台管理员操作，可以操作任意账户。如果指定操作者，则操作者必须为账户所有者。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者。如不填，默认为 <code>cmeid_system</code>，表示平台管理员操作，可以操作任意账户。如果指定操作者，则操作者必须为账户所有者。</p>
     * @param Operator <p>操作者。如不填，默认为 <code>cmeid_system</code>，表示平台管理员操作，可以操作任意账户。如果指定操作者，则操作者必须为账户所有者。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DeleteAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAccountRequest(DeleteAccountRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

