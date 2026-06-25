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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountsRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云数据库账号。</p>
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * <p>新账户的密码。<br>说明：</p><ol><li>在8 ～ 64位字符数以内（推荐12位以上）。</li><li>至少包含其中两项：小写字母 a ~ z 或 大写字母 A ～ Z。数字0 ～ 9。_+-,&amp;=!@#$%^*().|。</li><li>不能包含非法字符。</li></ol>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>备注信息。最多支持输入255个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>新账户最大可用连接数，默认值为10240，最大可设置值为10240。</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云数据库账号。</p> 
     * @return Accounts <p>云数据库账号。</p>
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set <p>云数据库账号。</p>
     * @param Accounts <p>云数据库账号。</p>
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get <p>新账户的密码。<br>说明：</p><ol><li>在8 ～ 64位字符数以内（推荐12位以上）。</li><li>至少包含其中两项：小写字母 a ~ z 或 大写字母 A ～ Z。数字0 ～ 9。_+-,&amp;=!@#$%^*().|。</li><li>不能包含非法字符。</li></ol> 
     * @return Password <p>新账户的密码。<br>说明：</p><ol><li>在8 ～ 64位字符数以内（推荐12位以上）。</li><li>至少包含其中两项：小写字母 a ~ z 或 大写字母 A ～ Z。数字0 ～ 9。_+-,&amp;=!@#$%^*().|。</li><li>不能包含非法字符。</li></ol>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>新账户的密码。<br>说明：</p><ol><li>在8 ～ 64位字符数以内（推荐12位以上）。</li><li>至少包含其中两项：小写字母 a ~ z 或 大写字母 A ～ Z。数字0 ～ 9。_+-,&amp;=!@#$%^*().|。</li><li>不能包含非法字符。</li></ol>
     * @param Password <p>新账户的密码。<br>说明：</p><ol><li>在8 ～ 64位字符数以内（推荐12位以上）。</li><li>至少包含其中两项：小写字母 a ~ z 或 大写字母 A ～ Z。数字0 ～ 9。_+-,&amp;=!@#$%^*().|。</li><li>不能包含非法字符。</li></ol>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>备注信息。最多支持输入255个字符。</p> 
     * @return Description <p>备注信息。最多支持输入255个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注信息。最多支持输入255个字符。</p>
     * @param Description <p>备注信息。最多支持输入255个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>新账户最大可用连接数，默认值为10240，最大可设置值为10240。</p> 
     * @return MaxUserConnections <p>新账户最大可用连接数，默认值为10240，最大可设置值为10240。</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>新账户最大可用连接数，默认值为10240，最大可设置值为10240。</p>
     * @param MaxUserConnections <p>新账户最大可用连接数，默认值为10240，最大可设置值为10240。</p>
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public CreateAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountsRequest(CreateAccountsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

