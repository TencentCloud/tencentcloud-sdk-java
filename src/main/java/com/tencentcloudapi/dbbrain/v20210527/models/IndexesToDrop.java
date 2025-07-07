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

public class IndexesToDrop extends AbstractModel {

    /**
    * 索引字符串。
    */
    @SerializedName("IndexStr")
    @Expose
    private String IndexStr;

    /**
    * 索引得分。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 无效原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 删除索引命令。
    */
    @SerializedName("IndexCommand")
    @Expose
    private String IndexCommand;

    /**
    * 索引名。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

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
     * Get 无效原因。 
     * @return Reason 无效原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 无效原因。
     * @param Reason 无效原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 删除索引命令。 
     * @return IndexCommand 删除索引命令。
     */
    public String getIndexCommand() {
        return this.IndexCommand;
    }

    /**
     * Set 删除索引命令。
     * @param IndexCommand 删除索引命令。
     */
    public void setIndexCommand(String IndexCommand) {
        this.IndexCommand = IndexCommand;
    }

    /**
     * Get 索引名。 
     * @return IndexName 索引名。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名。
     * @param IndexName 索引名。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    public IndexesToDrop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexesToDrop(IndexesToDrop source) {
        if (source.IndexStr != null) {
            this.IndexStr = new String(source.IndexStr);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.IndexCommand != null) {
            this.IndexCommand = new String(source.IndexCommand);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexStr", this.IndexStr);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "IndexCommand", this.IndexCommand);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);

    }
}

