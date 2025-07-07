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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexesToBuild extends AbstractModel {

    /**
    * 索引id，唯一标识一个索引。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 创建索引命令。
    */
    @SerializedName("IndexCommand")
    @Expose
    private String IndexCommand;

    /**
    * 索引字符串。
    */
    @SerializedName("IndexStr")
    @Expose
    private String IndexStr;

    /**
    * 优化级别，1-4，优先级从高到低。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 索引得分。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 签名。
    */
    @SerializedName("Signs")
    @Expose
    private String [] Signs;

    /**
    * 0-待创建；1-创建中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 索引id，唯一标识一个索引。 
     * @return Id 索引id，唯一标识一个索引。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 索引id，唯一标识一个索引。
     * @param Id 索引id，唯一标识一个索引。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 创建索引命令。 
     * @return IndexCommand 创建索引命令。
     */
    public String getIndexCommand() {
        return this.IndexCommand;
    }

    /**
     * Set 创建索引命令。
     * @param IndexCommand 创建索引命令。
     */
    public void setIndexCommand(String IndexCommand) {
        this.IndexCommand = IndexCommand;
    }

    /**
     * Get 索引字符串。 
     * @return IndexStr 索引字符串。
     */
    public String getIndexStr() {
        return this.IndexStr;
    }

    /**
     * Set 索引字符串。
     * @param IndexStr 索引字符串。
     */
    public void setIndexStr(String IndexStr) {
        this.IndexStr = IndexStr;
    }

    /**
     * Get 优化级别，1-4，优先级从高到低。 
     * @return Level 优化级别，1-4，优先级从高到低。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 优化级别，1-4，优先级从高到低。
     * @param Level 优化级别，1-4，优先级从高到低。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 索引得分。 
     * @return Score 索引得分。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 索引得分。
     * @param Score 索引得分。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 签名。 
     * @return Signs 签名。
     */
    public String [] getSigns() {
        return this.Signs;
    }

    /**
     * Set 签名。
     * @param Signs 签名。
     */
    public void setSigns(String [] Signs) {
        this.Signs = Signs;
    }

    /**
     * Get 0-待创建；1-创建中。 
     * @return Status 0-待创建；1-创建中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0-待创建；1-创建中。
     * @param Status 0-待创建；1-创建中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public IndexesToBuild() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexesToBuild(IndexesToBuild source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IndexCommand != null) {
            this.IndexCommand = new String(source.IndexCommand);
        }
        if (source.IndexStr != null) {
            this.IndexStr = new String(source.IndexStr);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Signs != null) {
            this.Signs = new String[source.Signs.length];
            for (int i = 0; i < source.Signs.length; i++) {
                this.Signs[i] = new String(source.Signs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IndexCommand", this.IndexCommand);
        this.setParamSimple(map, prefix + "IndexStr", this.IndexStr);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "Signs.", this.Signs);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

