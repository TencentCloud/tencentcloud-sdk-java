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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAddressAttributeRequest extends AbstractModel {

    /**
    * <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>修改后的 EIP 名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。</p>
    */
    @SerializedName("AddressName")
    @Expose
    private String AddressName;

    /**
    * <p>设定EIP是否直通，&quot;TRUE&quot;表示直通，&quot;FALSE&quot;表示非直通。<br>注意：该参数仅对 EIP 直通功能可见的用户可以设定，EIP 必须为绑定状态，绑定的对象为 CVM 。</p>
    */
    @SerializedName("EipDirectConnection")
    @Expose
    private String EipDirectConnection;

    /**
    * <p>设定EIP是否在网卡可见</p>
    */
    @SerializedName("EipVisibleOnEni")
    @Expose
    private Boolean EipVisibleOnEni;

    /**
     * Get <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p> 
     * @return AddressId <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     * @param AddressId <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>修改后的 EIP 名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。</p> 
     * @return AddressName <p>修改后的 EIP 名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。</p>
     */
    public String getAddressName() {
        return this.AddressName;
    }

    /**
     * Set <p>修改后的 EIP 名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。</p>
     * @param AddressName <p>修改后的 EIP 名称。长度上限为128个字符，允许使用大小写字母、汉字、数字、连字符&quot;-&quot;和下划线&quot;_&quot;，不能包含空格。</p>
     */
    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }

    /**
     * Get <p>设定EIP是否直通，&quot;TRUE&quot;表示直通，&quot;FALSE&quot;表示非直通。<br>注意：该参数仅对 EIP 直通功能可见的用户可以设定，EIP 必须为绑定状态，绑定的对象为 CVM 。</p> 
     * @return EipDirectConnection <p>设定EIP是否直通，&quot;TRUE&quot;表示直通，&quot;FALSE&quot;表示非直通。<br>注意：该参数仅对 EIP 直通功能可见的用户可以设定，EIP 必须为绑定状态，绑定的对象为 CVM 。</p>
     */
    public String getEipDirectConnection() {
        return this.EipDirectConnection;
    }

    /**
     * Set <p>设定EIP是否直通，&quot;TRUE&quot;表示直通，&quot;FALSE&quot;表示非直通。<br>注意：该参数仅对 EIP 直通功能可见的用户可以设定，EIP 必须为绑定状态，绑定的对象为 CVM 。</p>
     * @param EipDirectConnection <p>设定EIP是否直通，&quot;TRUE&quot;表示直通，&quot;FALSE&quot;表示非直通。<br>注意：该参数仅对 EIP 直通功能可见的用户可以设定，EIP 必须为绑定状态，绑定的对象为 CVM 。</p>
     */
    public void setEipDirectConnection(String EipDirectConnection) {
        this.EipDirectConnection = EipDirectConnection;
    }

    /**
     * Get <p>设定EIP是否在网卡可见</p> 
     * @return EipVisibleOnEni <p>设定EIP是否在网卡可见</p>
     */
    public Boolean getEipVisibleOnEni() {
        return this.EipVisibleOnEni;
    }

    /**
     * Set <p>设定EIP是否在网卡可见</p>
     * @param EipVisibleOnEni <p>设定EIP是否在网卡可见</p>
     */
    public void setEipVisibleOnEni(Boolean EipVisibleOnEni) {
        this.EipVisibleOnEni = EipVisibleOnEni;
    }

    public ModifyAddressAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressAttributeRequest(ModifyAddressAttributeRequest source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.AddressName != null) {
            this.AddressName = new String(source.AddressName);
        }
        if (source.EipDirectConnection != null) {
            this.EipDirectConnection = new String(source.EipDirectConnection);
        }
        if (source.EipVisibleOnEni != null) {
            this.EipVisibleOnEni = new Boolean(source.EipVisibleOnEni);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "AddressName", this.AddressName);
        this.setParamSimple(map, prefix + "EipDirectConnection", this.EipDirectConnection);
        this.setParamSimple(map, prefix + "EipVisibleOnEni", this.EipVisibleOnEni);

    }
}

