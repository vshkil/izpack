/*
 * $Id$
 * IzPack - Copyright 2001-2008 Julien Ponge, All Rights Reserved.
 * 
 * http://izpack.org/
 * http://izpack.codehaus.org/
 * 
 * Copyright 2005 Klaus Bartz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.izforge.izpack.compiler.compressor;

import com.izforge.izpack.api.substitutor.VariableSubstitutor;
import com.izforge.izpack.merge.MergeManager;


/**
 * IzPack will be able to support different compression methods for the
 * packs included in the installation jar file.
 * This class implements the PackCompressor for the compression format "bzip2".
 *
 * @author Klaus Bartz
 */
public class BZip2PackCompressor extends PackCompressorBase
{

    private static final String[] THIS_FORMAT_NAMES = {"bzip2"};
    private static final String THIS_DECODER_MAPPER = "org.apache.tools.bzip2.CBZip2InputStream";
    private static final String THIS_ENCODER_CLASS_NAME = "org.apache.tools.bzip2.CBZip2OutputStream";

    /**
     *
     */
    public BZip2PackCompressor(VariableSubstitutor variableSubstitutor, MergeManager mergeManager)
    {
        super(variableSubstitutor);
        mergeManager.addResourceToMerge("org/apache/tools/bzip2");
        formatNames = THIS_FORMAT_NAMES;
        decoderMapper = THIS_DECODER_MAPPER;
        encoderClassName = THIS_ENCODER_CLASS_NAME;
    }


}
