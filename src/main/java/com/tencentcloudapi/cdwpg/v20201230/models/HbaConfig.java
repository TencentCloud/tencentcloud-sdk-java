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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HbaConfig extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据库
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * ip地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 方法
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 是否遮盖
    */
    @SerializedName("Mask")
    @Expose
    private String Mask;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据库 
     * @return Database 数据库
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库
     * @param Database 数据库
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get ip地址 
     * @return Address ip地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set ip地址
     * @param Address ip地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 方法 
     * @return Method 方法
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 方法
     * @param Method 方法
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 是否遮盖 
     * @return Mask 是否遮盖
     */
    public String getMask() {
        return this.Mask;
    }

    /**
     * Set 是否遮盖
     * @param Mask 是否遮盖
     */
    public void setMask(String Mask) {
        this.Mask = Mask;
    }

    public HbaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HbaConfig(HbaConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Mask != null) {
            this.Mask = new String(source.Mask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Mask", this.Mask);

    }
}

