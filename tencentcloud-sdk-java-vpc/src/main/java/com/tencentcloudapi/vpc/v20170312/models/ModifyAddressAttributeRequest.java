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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressAttributeRequest extends AbstractModel{

    /**
    * 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 修改后的 EIP 名称。长度上限为20个字符。
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * 设定EIP是否直通，"TRUE"表示直通，"FALSE"表示非直通。注意该参数仅对EIP直通功能可见的用户可以设定。
    */
    @SerializedName("EipDirectConnection")
    @Expose
    private String EipDirectConnection;

    /**
     * Get 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。 
     * @return AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     * @param AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：`eip-11112222`。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 修改后的 EIP 名称。长度上限为20个字符。 
     * @return AddressName 修改后的 EIP 名称。长度上限为20个字符。
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set 修改后的 EIP 名称。长度上限为20个字符。
     * @param AddressName 修改后的 EIP 名称。长度上限为20个字符。
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get 设定EIP是否直通，"TRUE"表示直通，"FALSE"表示非直通。注意该参数仅对EIP直通功能可见的用户可以设定。 
     * @return EipDirectConnection 设定EIP是否直通，"TRUE"表示直通，"FALSE"表示非直通。注意该参数仅对EIP直通功能可见的用户可以设定。
     */
    public String getEipDirectConnection() {
        return this.EipDirectConnection;
    }

    /**
     * Set 设定EIP是否直通，"TRUE"表示直通，"FALSE"表示非直通。注意该参数仅对EIP直通功能可见的用户可以设定。
     * @param EipDirectConnection 设定EIP是否直通，"TRUE"表示直通，"FALSE"表示非直通。注意该参数仅对EIP直通功能可见的用户可以设定。
     */
    public void setEipDirectConnection(String EipDirectConnection) {
        this.EipDirectConnection = EipDirectConnection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "EipDirectConnection", this.EipDirectConnection);

    }
}

