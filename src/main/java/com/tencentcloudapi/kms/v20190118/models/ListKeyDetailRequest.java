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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListKeyDetailRequest extends AbstractModel {

    /**
    * <p>含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>含义跟 SQL 查询的 Limit 一致，表示本次最多获取 Limit 个元素。缺省值为10，最大值为200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk</p>
    */
    @SerializedName("Role")
    @Expose
    private Long Role;

    /**
    * <p>根据CMK创建时间排序， 0 表示按照降序排序，1表示按照升序排序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>根据CMK状态筛选， 0表示全部CMK， 1 表示仅查询Enabled CMK， 2 表示仅查询Disabled CMK，3 表示查询PendingDelete 状态的CMK(处于计划删除状态的Key)，4 表示查询 PendingImport 状态的CMK，5 表示查询 Archived 状态的 CMK</p>
    */
    @SerializedName("KeyState")
    @Expose
    private Long KeyState;

    /**
    * <p>根据KeyId或者Alias进行模糊匹配查询</p>
    */
    @SerializedName("SearchKeyAlias")
    @Expose
    private String SearchKeyAlias;

    /**
    * <p>根据CMK类型筛选， &quot;TENCENT_KMS&quot; 表示筛选密钥材料由KMS创建的CMK， &quot;EXTERNAL&quot; 表示筛选密钥材料需要用户导入的 EXTERNAL类型CMK，&quot;ALL&quot; 或者不设置表示两种类型都查询，大小写敏感。</p>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * <p>根据CMK的KeyUsage筛选，ALL表示筛选全部，可使用的参数为：ALL 或 ENCRYPT_DECRYPT 或 ASYMMETRIC_DECRYPT_RSA_2048 或 ASYMMETRIC_DECRYPT_SM2 或 ASYMMETRIC_SIGN_VERIFY_SM2 或 ASYMMETRIC_SIGN_VERIFY_RSA_2048 或 ASYMMETRIC_SIGN_VERIFY_ECC，为空则默认筛选ENCRYPT_DECRYPT类型</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>标签过滤条件</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。当指定集群ID时查询集群的密钥列表；当指定default时,查询公有云共享版的密钥列表；当为空，默认查询所有的密钥列表包括集群和非集群。</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * <p>可信服务成员账号信息数组</p>
    */
    @SerializedName("MemberAccounts")
    @Expose
    private MemberAccount [] MemberAccounts;

    /**
     * Get <p>含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0</p> 
     * @return Offset <p>含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0</p>
     * @param Offset <p>含义跟 SQL 查询的 Offset 一致，表示本次获取从按一定顺序排列数组的第 Offset 个元素开始，缺省为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>含义跟 SQL 查询的 Limit 一致，表示本次最多获取 Limit 个元素。缺省值为10，最大值为200</p> 
     * @return Limit <p>含义跟 SQL 查询的 Limit 一致，表示本次最多获取 Limit 个元素。缺省值为10，最大值为200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>含义跟 SQL 查询的 Limit 一致，表示本次最多获取 Limit 个元素。缺省值为10，最大值为200</p>
     * @param Limit <p>含义跟 SQL 查询的 Limit 一致，表示本次最多获取 Limit 个元素。缺省值为10，最大值为200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk</p> 
     * @return Role <p>根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk</p>
     */
    public Long getRole() {
        return this.Role;
    }

    /**
     * Set <p>根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk</p>
     * @param Role <p>根据创建者角色筛选，默认 0 表示用户自己创建的cmk， 1 表示授权其它云产品自动创建的cmk</p>
     */
    public void setRole(Long Role) {
        this.Role = Role;
    }

    /**
     * Get <p>根据CMK创建时间排序， 0 表示按照降序排序，1表示按照升序排序</p> 
     * @return OrderType <p>根据CMK创建时间排序， 0 表示按照降序排序，1表示按照升序排序</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>根据CMK创建时间排序， 0 表示按照降序排序，1表示按照升序排序</p>
     * @param OrderType <p>根据CMK创建时间排序， 0 表示按照降序排序，1表示按照升序排序</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>根据CMK状态筛选， 0表示全部CMK， 1 表示仅查询Enabled CMK， 2 表示仅查询Disabled CMK，3 表示查询PendingDelete 状态的CMK(处于计划删除状态的Key)，4 表示查询 PendingImport 状态的CMK，5 表示查询 Archived 状态的 CMK</p> 
     * @return KeyState <p>根据CMK状态筛选， 0表示全部CMK， 1 表示仅查询Enabled CMK， 2 表示仅查询Disabled CMK，3 表示查询PendingDelete 状态的CMK(处于计划删除状态的Key)，4 表示查询 PendingImport 状态的CMK，5 表示查询 Archived 状态的 CMK</p>
     */
    public Long getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>根据CMK状态筛选， 0表示全部CMK， 1 表示仅查询Enabled CMK， 2 表示仅查询Disabled CMK，3 表示查询PendingDelete 状态的CMK(处于计划删除状态的Key)，4 表示查询 PendingImport 状态的CMK，5 表示查询 Archived 状态的 CMK</p>
     * @param KeyState <p>根据CMK状态筛选， 0表示全部CMK， 1 表示仅查询Enabled CMK， 2 表示仅查询Disabled CMK，3 表示查询PendingDelete 状态的CMK(处于计划删除状态的Key)，4 表示查询 PendingImport 状态的CMK，5 表示查询 Archived 状态的 CMK</p>
     */
    public void setKeyState(Long KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>根据KeyId或者Alias进行模糊匹配查询</p> 
     * @return SearchKeyAlias <p>根据KeyId或者Alias进行模糊匹配查询</p>
     */
    public String getSearchKeyAlias() {
        return this.SearchKeyAlias;
    }

    /**
     * Set <p>根据KeyId或者Alias进行模糊匹配查询</p>
     * @param SearchKeyAlias <p>根据KeyId或者Alias进行模糊匹配查询</p>
     */
    public void setSearchKeyAlias(String SearchKeyAlias) {
        this.SearchKeyAlias = SearchKeyAlias;
    }

    /**
     * Get <p>根据CMK类型筛选， &quot;TENCENT_KMS&quot; 表示筛选密钥材料由KMS创建的CMK， &quot;EXTERNAL&quot; 表示筛选密钥材料需要用户导入的 EXTERNAL类型CMK，&quot;ALL&quot; 或者不设置表示两种类型都查询，大小写敏感。</p> 
     * @return Origin <p>根据CMK类型筛选， &quot;TENCENT_KMS&quot; 表示筛选密钥材料由KMS创建的CMK， &quot;EXTERNAL&quot; 表示筛选密钥材料需要用户导入的 EXTERNAL类型CMK，&quot;ALL&quot; 或者不设置表示两种类型都查询，大小写敏感。</p>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set <p>根据CMK类型筛选， &quot;TENCENT_KMS&quot; 表示筛选密钥材料由KMS创建的CMK， &quot;EXTERNAL&quot; 表示筛选密钥材料需要用户导入的 EXTERNAL类型CMK，&quot;ALL&quot; 或者不设置表示两种类型都查询，大小写敏感。</p>
     * @param Origin <p>根据CMK类型筛选， &quot;TENCENT_KMS&quot; 表示筛选密钥材料由KMS创建的CMK， &quot;EXTERNAL&quot; 表示筛选密钥材料需要用户导入的 EXTERNAL类型CMK，&quot;ALL&quot; 或者不设置表示两种类型都查询，大小写敏感。</p>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get <p>根据CMK的KeyUsage筛选，ALL表示筛选全部，可使用的参数为：ALL 或 ENCRYPT_DECRYPT 或 ASYMMETRIC_DECRYPT_RSA_2048 或 ASYMMETRIC_DECRYPT_SM2 或 ASYMMETRIC_SIGN_VERIFY_SM2 或 ASYMMETRIC_SIGN_VERIFY_RSA_2048 或 ASYMMETRIC_SIGN_VERIFY_ECC，为空则默认筛选ENCRYPT_DECRYPT类型</p> 
     * @return KeyUsage <p>根据CMK的KeyUsage筛选，ALL表示筛选全部，可使用的参数为：ALL 或 ENCRYPT_DECRYPT 或 ASYMMETRIC_DECRYPT_RSA_2048 或 ASYMMETRIC_DECRYPT_SM2 或 ASYMMETRIC_SIGN_VERIFY_SM2 或 ASYMMETRIC_SIGN_VERIFY_RSA_2048 或 ASYMMETRIC_SIGN_VERIFY_ECC，为空则默认筛选ENCRYPT_DECRYPT类型</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>根据CMK的KeyUsage筛选，ALL表示筛选全部，可使用的参数为：ALL 或 ENCRYPT_DECRYPT 或 ASYMMETRIC_DECRYPT_RSA_2048 或 ASYMMETRIC_DECRYPT_SM2 或 ASYMMETRIC_SIGN_VERIFY_SM2 或 ASYMMETRIC_SIGN_VERIFY_RSA_2048 或 ASYMMETRIC_SIGN_VERIFY_ECC，为空则默认筛选ENCRYPT_DECRYPT类型</p>
     * @param KeyUsage <p>根据CMK的KeyUsage筛选，ALL表示筛选全部，可使用的参数为：ALL 或 ENCRYPT_DECRYPT 或 ASYMMETRIC_DECRYPT_RSA_2048 或 ASYMMETRIC_DECRYPT_SM2 或 ASYMMETRIC_SIGN_VERIFY_SM2 或 ASYMMETRIC_SIGN_VERIFY_RSA_2048 或 ASYMMETRIC_SIGN_VERIFY_ECC，为空则默认筛选ENCRYPT_DECRYPT类型</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>标签过滤条件</p> 
     * @return TagFilters <p>标签过滤条件</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>标签过滤条件</p>
     * @param TagFilters <p>标签过滤条件</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。当指定集群ID时查询集群的密钥列表；当指定default时,查询公有云共享版的密钥列表；当为空，默认查询所有的密钥列表包括集群和非集群。</p> 
     * @return HsmClusterId <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。当指定集群ID时查询集群的密钥列表；当指定default时,查询公有云共享版的密钥列表；当为空，默认查询所有的密钥列表包括集群和非集群。</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。当指定集群ID时查询集群的密钥列表；当指定default时,查询公有云共享版的密钥列表；当为空，默认查询所有的密钥列表包括集群和非集群。</p>
     * @param HsmClusterId <p>KMS 高级版对应的 HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）。当指定集群ID时查询集群的密钥列表；当指定default时,查询公有云共享版的密钥列表；当为空，默认查询所有的密钥列表包括集群和非集群。</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
    }

    /**
     * Get <p>可信服务成员账号信息数组</p> 
     * @return MemberAccounts <p>可信服务成员账号信息数组</p>
     */
    public MemberAccount [] getMemberAccounts() {
        return this.MemberAccounts;
    }

    /**
     * Set <p>可信服务成员账号信息数组</p>
     * @param MemberAccounts <p>可信服务成员账号信息数组</p>
     */
    public void setMemberAccounts(MemberAccount [] MemberAccounts) {
        this.MemberAccounts = MemberAccounts;
    }

    public ListKeyDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListKeyDetailRequest(ListKeyDetailRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Role != null) {
            this.Role = new Long(source.Role);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.KeyState != null) {
            this.KeyState = new Long(source.KeyState);
        }
        if (source.SearchKeyAlias != null) {
            this.SearchKeyAlias = new String(source.SearchKeyAlias);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.MemberAccounts != null) {
            this.MemberAccounts = new MemberAccount[source.MemberAccounts.length];
            for (int i = 0; i < source.MemberAccounts.length; i++) {
                this.MemberAccounts[i] = new MemberAccount(source.MemberAccounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "SearchKeyAlias", this.SearchKeyAlias);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamArrayObj(map, prefix + "MemberAccounts.", this.MemberAccounts);

    }
}

