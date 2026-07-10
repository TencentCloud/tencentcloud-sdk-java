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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewPGUserMigrationsRequest extends AbstractModel {

    /**
    * <p>云开发环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>预览要执行的migration 列表</p>
    */
    @SerializedName("Migrations")
    @Expose
    private MigrationInput [] Migrations;

    /**
    * <p>标记请求来源</p><p>deprecated</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>是否允许 out-of-order local migrations</p><p>默认值：false</p>
    */
    @SerializedName("IncludeAll")
    @Expose
    private Boolean IncludeAll;

    /**
     * Get <p>云开发环境ID</p> 
     * @return EnvId <p>云开发环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>云开发环境ID</p>
     * @param EnvId <p>云开发环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>预览要执行的migration 列表</p> 
     * @return Migrations <p>预览要执行的migration 列表</p>
     */
    public MigrationInput [] getMigrations() {
        return this.Migrations;
    }

    /**
     * Set <p>预览要执行的migration 列表</p>
     * @param Migrations <p>预览要执行的migration 列表</p>
     */
    public void setMigrations(MigrationInput [] Migrations) {
        this.Migrations = Migrations;
    }

    /**
     * Get <p>标记请求来源</p><p>deprecated</p> 
     * @return Source <p>标记请求来源</p><p>deprecated</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>标记请求来源</p><p>deprecated</p>
     * @param Source <p>标记请求来源</p><p>deprecated</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>是否允许 out-of-order local migrations</p><p>默认值：false</p> 
     * @return IncludeAll <p>是否允许 out-of-order local migrations</p><p>默认值：false</p>
     */
    public Boolean getIncludeAll() {
        return this.IncludeAll;
    }

    /**
     * Set <p>是否允许 out-of-order local migrations</p><p>默认值：false</p>
     * @param IncludeAll <p>是否允许 out-of-order local migrations</p><p>默认值：false</p>
     */
    public void setIncludeAll(Boolean IncludeAll) {
        this.IncludeAll = IncludeAll;
    }

    public PreviewPGUserMigrationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewPGUserMigrationsRequest(PreviewPGUserMigrationsRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Migrations != null) {
            this.Migrations = new MigrationInput[source.Migrations.length];
            for (int i = 0; i < source.Migrations.length; i++) {
                this.Migrations[i] = new MigrationInput(source.Migrations[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.IncludeAll != null) {
            this.IncludeAll = new Boolean(source.IncludeAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "Migrations.", this.Migrations);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "IncludeAll", this.IncludeAll);

    }
}

