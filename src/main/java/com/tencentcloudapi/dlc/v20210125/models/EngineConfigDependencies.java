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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineConfigDependencies extends AbstractModel {

    /**
    * <p>JAR 列表：每行一个 COS 路径或 Maven GAV。</p>
    */
    @SerializedName("Jars")
    @Expose
    private String [] Jars;

    /**
    * <p>files 列表：COS 路径，下载到 executor 工作目录（不解压）。</p>
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
    * <p>archives 列表：COS 路径，下载并解压到 executor 工作目录。</p>
    */
    @SerializedName("Archives")
    @Expose
    private String [] Archives;

    /**
    * <p>pyFiles 列表：COS 路径（.py/.zip/.egg/.whl），等价 Spark --py-files。</p>
    */
    @SerializedName("PyFiles")
    @Expose
    private String [] PyFiles;

    /**
     * Get <p>JAR 列表：每行一个 COS 路径或 Maven GAV。</p> 
     * @return Jars <p>JAR 列表：每行一个 COS 路径或 Maven GAV。</p>
     */
    public String [] getJars() {
        return this.Jars;
    }

    /**
     * Set <p>JAR 列表：每行一个 COS 路径或 Maven GAV。</p>
     * @param Jars <p>JAR 列表：每行一个 COS 路径或 Maven GAV。</p>
     */
    public void setJars(String [] Jars) {
        this.Jars = Jars;
    }

    /**
     * Get <p>files 列表：COS 路径，下载到 executor 工作目录（不解压）。</p> 
     * @return Files <p>files 列表：COS 路径，下载到 executor 工作目录（不解压）。</p>
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set <p>files 列表：COS 路径，下载到 executor 工作目录（不解压）。</p>
     * @param Files <p>files 列表：COS 路径，下载到 executor 工作目录（不解压）。</p>
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    /**
     * Get <p>archives 列表：COS 路径，下载并解压到 executor 工作目录。</p> 
     * @return Archives <p>archives 列表：COS 路径，下载并解压到 executor 工作目录。</p>
     */
    public String [] getArchives() {
        return this.Archives;
    }

    /**
     * Set <p>archives 列表：COS 路径，下载并解压到 executor 工作目录。</p>
     * @param Archives <p>archives 列表：COS 路径，下载并解压到 executor 工作目录。</p>
     */
    public void setArchives(String [] Archives) {
        this.Archives = Archives;
    }

    /**
     * Get <p>pyFiles 列表：COS 路径（.py/.zip/.egg/.whl），等价 Spark --py-files。</p> 
     * @return PyFiles <p>pyFiles 列表：COS 路径（.py/.zip/.egg/.whl），等价 Spark --py-files。</p>
     */
    public String [] getPyFiles() {
        return this.PyFiles;
    }

    /**
     * Set <p>pyFiles 列表：COS 路径（.py/.zip/.egg/.whl），等价 Spark --py-files。</p>
     * @param PyFiles <p>pyFiles 列表：COS 路径（.py/.zip/.egg/.whl），等价 Spark --py-files。</p>
     */
    public void setPyFiles(String [] PyFiles) {
        this.PyFiles = PyFiles;
    }

    public EngineConfigDependencies() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineConfigDependencies(EngineConfigDependencies source) {
        if (source.Jars != null) {
            this.Jars = new String[source.Jars.length];
            for (int i = 0; i < source.Jars.length; i++) {
                this.Jars[i] = new String(source.Jars[i]);
            }
        }
        if (source.Files != null) {
            this.Files = new String[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new String(source.Files[i]);
            }
        }
        if (source.Archives != null) {
            this.Archives = new String[source.Archives.length];
            for (int i = 0; i < source.Archives.length; i++) {
                this.Archives[i] = new String(source.Archives[i]);
            }
        }
        if (source.PyFiles != null) {
            this.PyFiles = new String[source.PyFiles.length];
            for (int i = 0; i < source.PyFiles.length; i++) {
                this.PyFiles[i] = new String(source.PyFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Jars.", this.Jars);
        this.setParamArraySimple(map, prefix + "Files.", this.Files);
        this.setParamArraySimple(map, prefix + "Archives.", this.Archives);
        this.setParamArraySimple(map, prefix + "PyFiles.", this.PyFiles);

    }
}

