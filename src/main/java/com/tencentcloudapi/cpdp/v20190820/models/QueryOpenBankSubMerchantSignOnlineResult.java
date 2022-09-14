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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOpenBankSubMerchantSignOnlineResult extends AbstractModel{

    /**
    * 处理状态
  SUCCESS：签约成功
  FAILED：签约失败
  PROCESSING：签约中
    */
    @SerializedName("SignStatus")
    @Expose
    private String SignStatus;

    /**
    * 上传返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignMessage")
    @Expose
    private String SignMessage;

    /**
     * Get 处理状态
  SUCCESS：签约成功
  FAILED：签约失败
  PROCESSING：签约中 
     * @return SignStatus 处理状态
  SUCCESS：签约成功
  FAILED：签约失败
  PROCESSING：签约中
     */
    public String getSignStatus() {
        return this.SignStatus;
    }

    /**
     * Set 处理状态
  SUCCESS：签约成功
  FAILED：签约失败
  PROCESSING：签约中
     * @param SignStatus 处理状态
  SUCCESS：签约成功
  FAILED：签约失败
  PROCESSING：签约中
     */
    public void setSignStatus(String SignStatus) {
        this.SignStatus = SignStatus;
    }

    /**
     * Get 上传返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignMessage 上传返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignMessage() {
        return this.SignMessage;
    }

    /**
     * Set 上传返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignMessage 上传返回描述，例如失败原因等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignMessage(String SignMessage) {
        this.SignMessage = SignMessage;
    }

    public QueryOpenBankSubMerchantSignOnlineResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankSubMerchantSignOnlineResult(QueryOpenBankSubMerchantSignOnlineResult source) {
        if (source.SignStatus != null) {
            this.SignStatus = new String(source.SignStatus);
        }
        if (source.SignMessage != null) {
            this.SignMessage = new String(source.SignMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignStatus", this.SignStatus);
        this.setParamSimple(map, prefix + "SignMessage", this.SignMessage);

    }
}

