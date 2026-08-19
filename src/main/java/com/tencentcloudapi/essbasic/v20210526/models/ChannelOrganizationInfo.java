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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelOrganizationInfo extends AbstractModel {

    /**
    * <p>电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>第三方平台子客企业的唯一标识</p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>第三方平台子客企业名称</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>企业的统一社会信用代码</p>
    */
    @SerializedName("UnifiedSocialCreditCode")
    @Expose
    private String UnifiedSocialCreditCode;

    /**
    * <p>企业法定代表人的姓名</p>
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * <p>企业法定代表人作为第三方平台子客企业员工的唯一标识</p>
    */
    @SerializedName("LegalOpenId")
    @Expose
    private String LegalOpenId;

    /**
    * <p>企业超级管理员的姓名</p>
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * <p>企业超级管理员作为第三方平台子客企业员工的唯一标识</p>
    */
    @SerializedName("AdminOpenId")
    @Expose
    private String AdminOpenId;

    /**
    * <p>企业超级管理员的手机号码<br><strong>注</strong>：<code>手机号码脱敏（隐藏部分用*替代）</code></p>
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * <p>企业认证状态枚举值及说明如下：</p><table>  <thead>    <tr>      <th>枚举值</th>      <th>说明</th>    </tr>  </thead>  <tbody>    <tr>      <td><code>UNVERIFIED</code></td>      <td>企业未认证</td>    </tr>    <tr>      <td><code>VERIFYING</code></td>      <td>企业认证中，还未选择授权方式</td>    </tr>    <tr>      <td><code>VERIFYINGLEGALPENDINGAUTHORIZATION</code></td>      <td>企业认证中，待法人授权或法人认证</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEPENDING</code></td>      <td>企业认证中，已上传授权书，授权书待审核</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEREJECT</code></td>      <td>企业认证中，授权书审核被驳回</td>    </tr>    <tr>      <td><code>VERIFIED</code></td>      <td>企业已认证成功</td>    </tr>  </tbody></table><p>企业认证流程的典型流转路径如下：</p><pre><code>UNVERIFIED → VERIFYING（提交企业信息，选择授权方式）                ├─ 法人授权 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                ├─ 法人认证 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                └─ 授权书 → VERIFYINGAUTHORIZATIONFILEPENDING                              ├─ 审核通过 → VERIFIED                              └─ 审核驳回 → VERIFYINGAUTHORIZATIONFILEREJECT</code></pre><p>枚举值：</p><ul><li>UNVERIFIED： 企业未认证</li><li>VERIFYING： 企业认证中，还未选择授权方式</li><li>VERIFYINGLEGALPENDINGAUTHORIZATION： 企业认证中，待法人授权或法人认证</li><li>VERIFYINGAUTHORIZATIONFILEPENDING： 企业认证中，已上传授权书，授权书待审核</li><li>VERIFYINGAUTHORIZATIONFILEREJECT： 企业认证中，授权书审核被驳回</li><li>VERIFIED： 企业已认证成功</li></ul>
    */
    @SerializedName("AuthorizationStatus")
    @Expose
    private String AuthorizationStatus;

    /**
    * <p>企业认证方式字段。值如下：</p><ul>  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>  <li>**"AuthorizationFile"**： 授权书</li>  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li></ul>
    */
    @SerializedName("AuthorizationType")
    @Expose
    private String AuthorizationType;

    /**
    * <p>子企业激活状态。值如下：</p><ul>  <li>**0**： 未激活</li>  <li>**1**： 已激活</li></ul>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private Long ActiveStatus;

    /**
    * <p>账号到期时间，时间戳</p>
    */
    @SerializedName("LicenseExpireTime")
    @Expose
    private Long LicenseExpireTime;

    /**
    * <p>是否已提交企业认证信息</p><p>默认值：false</p><p>此参数表示客户是否已提交企业信息。如图所示，在点击提交按钮之前，该字段为 <code>false</code>；点击提交按钮之后，该字段变为 <code>true</code>。</p><img src="https://qcloudimg.tencent-cloud.cn/raw/548d838430b60e797dbfba80cb4a3ef7.png" alt="企业信息提交状态示意图"><p><strong>注意：</strong>该字段并非在变为 <code>true</code> 后就不再变化。任何导致当前认证记录失效的操作都会将其重置为 <code>false</code>，包括但不限于：重新提交企业信息、审核被拒绝后重新上传企业信息等操作。</p>
    */
    @SerializedName("HasSubmittedAuthInfo")
    @Expose
    private Boolean HasSubmittedAuthInfo;

    /**
     * Get <p>电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）</p> 
     * @return OrganizationId <p>电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）</p>
     * @param OrganizationId <p>电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>第三方平台子客企业的唯一标识</p> 
     * @return OrganizationOpenId <p>第三方平台子客企业的唯一标识</p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>第三方平台子客企业的唯一标识</p>
     * @param OrganizationOpenId <p>第三方平台子客企业的唯一标识</p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>第三方平台子客企业名称</p> 
     * @return OrganizationName <p>第三方平台子客企业名称</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>第三方平台子客企业名称</p>
     * @param OrganizationName <p>第三方平台子客企业名称</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>企业的统一社会信用代码</p> 
     * @return UnifiedSocialCreditCode <p>企业的统一社会信用代码</p>
     */
    public String getUnifiedSocialCreditCode() {
        return this.UnifiedSocialCreditCode;
    }

    /**
     * Set <p>企业的统一社会信用代码</p>
     * @param UnifiedSocialCreditCode <p>企业的统一社会信用代码</p>
     */
    public void setUnifiedSocialCreditCode(String UnifiedSocialCreditCode) {
        this.UnifiedSocialCreditCode = UnifiedSocialCreditCode;
    }

    /**
     * Get <p>企业法定代表人的姓名</p> 
     * @return LegalName <p>企业法定代表人的姓名</p>
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set <p>企业法定代表人的姓名</p>
     * @param LegalName <p>企业法定代表人的姓名</p>
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get <p>企业法定代表人作为第三方平台子客企业员工的唯一标识</p> 
     * @return LegalOpenId <p>企业法定代表人作为第三方平台子客企业员工的唯一标识</p>
     */
    public String getLegalOpenId() {
        return this.LegalOpenId;
    }

    /**
     * Set <p>企业法定代表人作为第三方平台子客企业员工的唯一标识</p>
     * @param LegalOpenId <p>企业法定代表人作为第三方平台子客企业员工的唯一标识</p>
     */
    public void setLegalOpenId(String LegalOpenId) {
        this.LegalOpenId = LegalOpenId;
    }

    /**
     * Get <p>企业超级管理员的姓名</p> 
     * @return AdminName <p>企业超级管理员的姓名</p>
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set <p>企业超级管理员的姓名</p>
     * @param AdminName <p>企业超级管理员的姓名</p>
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get <p>企业超级管理员作为第三方平台子客企业员工的唯一标识</p> 
     * @return AdminOpenId <p>企业超级管理员作为第三方平台子客企业员工的唯一标识</p>
     */
    public String getAdminOpenId() {
        return this.AdminOpenId;
    }

    /**
     * Set <p>企业超级管理员作为第三方平台子客企业员工的唯一标识</p>
     * @param AdminOpenId <p>企业超级管理员作为第三方平台子客企业员工的唯一标识</p>
     */
    public void setAdminOpenId(String AdminOpenId) {
        this.AdminOpenId = AdminOpenId;
    }

    /**
     * Get <p>企业超级管理员的手机号码<br><strong>注</strong>：<code>手机号码脱敏（隐藏部分用*替代）</code></p> 
     * @return AdminMobile <p>企业超级管理员的手机号码<br><strong>注</strong>：<code>手机号码脱敏（隐藏部分用*替代）</code></p>
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set <p>企业超级管理员的手机号码<br><strong>注</strong>：<code>手机号码脱敏（隐藏部分用*替代）</code></p>
     * @param AdminMobile <p>企业超级管理员的手机号码<br><strong>注</strong>：<code>手机号码脱敏（隐藏部分用*替代）</code></p>
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get <p>企业认证状态枚举值及说明如下：</p><table>  <thead>    <tr>      <th>枚举值</th>      <th>说明</th>    </tr>  </thead>  <tbody>    <tr>      <td><code>UNVERIFIED</code></td>      <td>企业未认证</td>    </tr>    <tr>      <td><code>VERIFYING</code></td>      <td>企业认证中，还未选择授权方式</td>    </tr>    <tr>      <td><code>VERIFYINGLEGALPENDINGAUTHORIZATION</code></td>      <td>企业认证中，待法人授权或法人认证</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEPENDING</code></td>      <td>企业认证中，已上传授权书，授权书待审核</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEREJECT</code></td>      <td>企业认证中，授权书审核被驳回</td>    </tr>    <tr>      <td><code>VERIFIED</code></td>      <td>企业已认证成功</td>    </tr>  </tbody></table><p>企业认证流程的典型流转路径如下：</p><pre><code>UNVERIFIED → VERIFYING（提交企业信息，选择授权方式）                ├─ 法人授权 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                ├─ 法人认证 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                └─ 授权书 → VERIFYINGAUTHORIZATIONFILEPENDING                              ├─ 审核通过 → VERIFIED                              └─ 审核驳回 → VERIFYINGAUTHORIZATIONFILEREJECT</code></pre><p>枚举值：</p><ul><li>UNVERIFIED： 企业未认证</li><li>VERIFYING： 企业认证中，还未选择授权方式</li><li>VERIFYINGLEGALPENDINGAUTHORIZATION： 企业认证中，待法人授权或法人认证</li><li>VERIFYINGAUTHORIZATIONFILEPENDING： 企业认证中，已上传授权书，授权书待审核</li><li>VERIFYINGAUTHORIZATIONFILEREJECT： 企业认证中，授权书审核被驳回</li><li>VERIFIED： 企业已认证成功</li></ul> 
     * @return AuthorizationStatus <p>企业认证状态枚举值及说明如下：</p><table>  <thead>    <tr>      <th>枚举值</th>      <th>说明</th>    </tr>  </thead>  <tbody>    <tr>      <td><code>UNVERIFIED</code></td>      <td>企业未认证</td>    </tr>    <tr>      <td><code>VERIFYING</code></td>      <td>企业认证中，还未选择授权方式</td>    </tr>    <tr>      <td><code>VERIFYINGLEGALPENDINGAUTHORIZATION</code></td>      <td>企业认证中，待法人授权或法人认证</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEPENDING</code></td>      <td>企业认证中，已上传授权书，授权书待审核</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEREJECT</code></td>      <td>企业认证中，授权书审核被驳回</td>    </tr>    <tr>      <td><code>VERIFIED</code></td>      <td>企业已认证成功</td>    </tr>  </tbody></table><p>企业认证流程的典型流转路径如下：</p><pre><code>UNVERIFIED → VERIFYING（提交企业信息，选择授权方式）                ├─ 法人授权 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                ├─ 法人认证 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                └─ 授权书 → VERIFYINGAUTHORIZATIONFILEPENDING                              ├─ 审核通过 → VERIFIED                              └─ 审核驳回 → VERIFYINGAUTHORIZATIONFILEREJECT</code></pre><p>枚举值：</p><ul><li>UNVERIFIED： 企业未认证</li><li>VERIFYING： 企业认证中，还未选择授权方式</li><li>VERIFYINGLEGALPENDINGAUTHORIZATION： 企业认证中，待法人授权或法人认证</li><li>VERIFYINGAUTHORIZATIONFILEPENDING： 企业认证中，已上传授权书，授权书待审核</li><li>VERIFYINGAUTHORIZATIONFILEREJECT： 企业认证中，授权书审核被驳回</li><li>VERIFIED： 企业已认证成功</li></ul>
     */
    public String getAuthorizationStatus() {
        return this.AuthorizationStatus;
    }

    /**
     * Set <p>企业认证状态枚举值及说明如下：</p><table>  <thead>    <tr>      <th>枚举值</th>      <th>说明</th>    </tr>  </thead>  <tbody>    <tr>      <td><code>UNVERIFIED</code></td>      <td>企业未认证</td>    </tr>    <tr>      <td><code>VERIFYING</code></td>      <td>企业认证中，还未选择授权方式</td>    </tr>    <tr>      <td><code>VERIFYINGLEGALPENDINGAUTHORIZATION</code></td>      <td>企业认证中，待法人授权或法人认证</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEPENDING</code></td>      <td>企业认证中，已上传授权书，授权书待审核</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEREJECT</code></td>      <td>企业认证中，授权书审核被驳回</td>    </tr>    <tr>      <td><code>VERIFIED</code></td>      <td>企业已认证成功</td>    </tr>  </tbody></table><p>企业认证流程的典型流转路径如下：</p><pre><code>UNVERIFIED → VERIFYING（提交企业信息，选择授权方式）                ├─ 法人授权 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                ├─ 法人认证 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                └─ 授权书 → VERIFYINGAUTHORIZATIONFILEPENDING                              ├─ 审核通过 → VERIFIED                              └─ 审核驳回 → VERIFYINGAUTHORIZATIONFILEREJECT</code></pre><p>枚举值：</p><ul><li>UNVERIFIED： 企业未认证</li><li>VERIFYING： 企业认证中，还未选择授权方式</li><li>VERIFYINGLEGALPENDINGAUTHORIZATION： 企业认证中，待法人授权或法人认证</li><li>VERIFYINGAUTHORIZATIONFILEPENDING： 企业认证中，已上传授权书，授权书待审核</li><li>VERIFYINGAUTHORIZATIONFILEREJECT： 企业认证中，授权书审核被驳回</li><li>VERIFIED： 企业已认证成功</li></ul>
     * @param AuthorizationStatus <p>企业认证状态枚举值及说明如下：</p><table>  <thead>    <tr>      <th>枚举值</th>      <th>说明</th>    </tr>  </thead>  <tbody>    <tr>      <td><code>UNVERIFIED</code></td>      <td>企业未认证</td>    </tr>    <tr>      <td><code>VERIFYING</code></td>      <td>企业认证中，还未选择授权方式</td>    </tr>    <tr>      <td><code>VERIFYINGLEGALPENDINGAUTHORIZATION</code></td>      <td>企业认证中，待法人授权或法人认证</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEPENDING</code></td>      <td>企业认证中，已上传授权书，授权书待审核</td>    </tr>    <tr>      <td><code>VERIFYINGAUTHORIZATIONFILEREJECT</code></td>      <td>企业认证中，授权书审核被驳回</td>    </tr>    <tr>      <td><code>VERIFIED</code></td>      <td>企业已认证成功</td>    </tr>  </tbody></table><p>企业认证流程的典型流转路径如下：</p><pre><code>UNVERIFIED → VERIFYING（提交企业信息，选择授权方式）                ├─ 法人授权 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                ├─ 法人认证 → VERIFYINGLEGALPENDINGAUTHORIZATION → VERIFIED                └─ 授权书 → VERIFYINGAUTHORIZATIONFILEPENDING                              ├─ 审核通过 → VERIFIED                              └─ 审核驳回 → VERIFYINGAUTHORIZATIONFILEREJECT</code></pre><p>枚举值：</p><ul><li>UNVERIFIED： 企业未认证</li><li>VERIFYING： 企业认证中，还未选择授权方式</li><li>VERIFYINGLEGALPENDINGAUTHORIZATION： 企业认证中，待法人授权或法人认证</li><li>VERIFYINGAUTHORIZATIONFILEPENDING： 企业认证中，已上传授权书，授权书待审核</li><li>VERIFYINGAUTHORIZATIONFILEREJECT： 企业认证中，授权书审核被驳回</li><li>VERIFIED： 企业已认证成功</li></ul>
     */
    public void setAuthorizationStatus(String AuthorizationStatus) {
        this.AuthorizationStatus = AuthorizationStatus;
    }

    /**
     * Get <p>企业认证方式字段。值如下：</p><ul>  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>  <li>**"AuthorizationFile"**： 授权书</li>  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li></ul> 
     * @return AuthorizationType <p>企业认证方式字段。值如下：</p><ul>  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>  <li>**"AuthorizationFile"**： 授权书</li>  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li></ul>
     */
    public String getAuthorizationType() {
        return this.AuthorizationType;
    }

    /**
     * Set <p>企业认证方式字段。值如下：</p><ul>  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>  <li>**"AuthorizationFile"**： 授权书</li>  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li></ul>
     * @param AuthorizationType <p>企业认证方式字段。值如下：</p><ul>  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>  <li>**"AuthorizationFile"**： 授权书</li>  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li></ul>
     */
    public void setAuthorizationType(String AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
    }

    /**
     * Get <p>子企业激活状态。值如下：</p><ul>  <li>**0**： 未激活</li>  <li>**1**： 已激活</li></ul> 
     * @return ActiveStatus <p>子企业激活状态。值如下：</p><ul>  <li>**0**： 未激活</li>  <li>**1**： 已激活</li></ul>
     */
    public Long getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set <p>子企业激活状态。值如下：</p><ul>  <li>**0**： 未激活</li>  <li>**1**： 已激活</li></ul>
     * @param ActiveStatus <p>子企业激活状态。值如下：</p><ul>  <li>**0**： 未激活</li>  <li>**1**： 已激活</li></ul>
     */
    public void setActiveStatus(Long ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get <p>账号到期时间，时间戳</p> 
     * @return LicenseExpireTime <p>账号到期时间，时间戳</p>
     */
    public Long getLicenseExpireTime() {
        return this.LicenseExpireTime;
    }

    /**
     * Set <p>账号到期时间，时间戳</p>
     * @param LicenseExpireTime <p>账号到期时间，时间戳</p>
     */
    public void setLicenseExpireTime(Long LicenseExpireTime) {
        this.LicenseExpireTime = LicenseExpireTime;
    }

    /**
     * Get <p>是否已提交企业认证信息</p><p>默认值：false</p><p>此参数表示客户是否已提交企业信息。如图所示，在点击提交按钮之前，该字段为 <code>false</code>；点击提交按钮之后，该字段变为 <code>true</code>。</p><img src="https://qcloudimg.tencent-cloud.cn/raw/548d838430b60e797dbfba80cb4a3ef7.png" alt="企业信息提交状态示意图"><p><strong>注意：</strong>该字段并非在变为 <code>true</code> 后就不再变化。任何导致当前认证记录失效的操作都会将其重置为 <code>false</code>，包括但不限于：重新提交企业信息、审核被拒绝后重新上传企业信息等操作。</p> 
     * @return HasSubmittedAuthInfo <p>是否已提交企业认证信息</p><p>默认值：false</p><p>此参数表示客户是否已提交企业信息。如图所示，在点击提交按钮之前，该字段为 <code>false</code>；点击提交按钮之后，该字段变为 <code>true</code>。</p><img src="https://qcloudimg.tencent-cloud.cn/raw/548d838430b60e797dbfba80cb4a3ef7.png" alt="企业信息提交状态示意图"><p><strong>注意：</strong>该字段并非在变为 <code>true</code> 后就不再变化。任何导致当前认证记录失效的操作都会将其重置为 <code>false</code>，包括但不限于：重新提交企业信息、审核被拒绝后重新上传企业信息等操作。</p>
     */
    public Boolean getHasSubmittedAuthInfo() {
        return this.HasSubmittedAuthInfo;
    }

    /**
     * Set <p>是否已提交企业认证信息</p><p>默认值：false</p><p>此参数表示客户是否已提交企业信息。如图所示，在点击提交按钮之前，该字段为 <code>false</code>；点击提交按钮之后，该字段变为 <code>true</code>。</p><img src="https://qcloudimg.tencent-cloud.cn/raw/548d838430b60e797dbfba80cb4a3ef7.png" alt="企业信息提交状态示意图"><p><strong>注意：</strong>该字段并非在变为 <code>true</code> 后就不再变化。任何导致当前认证记录失效的操作都会将其重置为 <code>false</code>，包括但不限于：重新提交企业信息、审核被拒绝后重新上传企业信息等操作。</p>
     * @param HasSubmittedAuthInfo <p>是否已提交企业认证信息</p><p>默认值：false</p><p>此参数表示客户是否已提交企业信息。如图所示，在点击提交按钮之前，该字段为 <code>false</code>；点击提交按钮之后，该字段变为 <code>true</code>。</p><img src="https://qcloudimg.tencent-cloud.cn/raw/548d838430b60e797dbfba80cb4a3ef7.png" alt="企业信息提交状态示意图"><p><strong>注意：</strong>该字段并非在变为 <code>true</code> 后就不再变化。任何导致当前认证记录失效的操作都会将其重置为 <code>false</code>，包括但不限于：重新提交企业信息、审核被拒绝后重新上传企业信息等操作。</p>
     */
    public void setHasSubmittedAuthInfo(Boolean HasSubmittedAuthInfo) {
        this.HasSubmittedAuthInfo = HasSubmittedAuthInfo;
    }

    public ChannelOrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelOrganizationInfo(ChannelOrganizationInfo source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UnifiedSocialCreditCode != null) {
            this.UnifiedSocialCreditCode = new String(source.UnifiedSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.LegalOpenId != null) {
            this.LegalOpenId = new String(source.LegalOpenId);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminOpenId != null) {
            this.AdminOpenId = new String(source.AdminOpenId);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AuthorizationStatus != null) {
            this.AuthorizationStatus = new String(source.AuthorizationStatus);
        }
        if (source.AuthorizationType != null) {
            this.AuthorizationType = new String(source.AuthorizationType);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new Long(source.ActiveStatus);
        }
        if (source.LicenseExpireTime != null) {
            this.LicenseExpireTime = new Long(source.LicenseExpireTime);
        }
        if (source.HasSubmittedAuthInfo != null) {
            this.HasSubmittedAuthInfo = new Boolean(source.HasSubmittedAuthInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCode", this.UnifiedSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalOpenId", this.LegalOpenId);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminOpenId", this.AdminOpenId);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AuthorizationStatus", this.AuthorizationStatus);
        this.setParamSimple(map, prefix + "AuthorizationType", this.AuthorizationType);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);
        this.setParamSimple(map, prefix + "LicenseExpireTime", this.LicenseExpireTime);
        this.setParamSimple(map, prefix + "HasSubmittedAuthInfo", this.HasSubmittedAuthInfo);

    }
}

